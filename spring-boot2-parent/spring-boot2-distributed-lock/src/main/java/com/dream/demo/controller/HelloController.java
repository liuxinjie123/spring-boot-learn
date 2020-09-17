package com.dream.demo.controller;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

import com.dream.demo.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.redis.util.RedisLockRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private RedisLockRegistry redisLockRegistry;

	/**
	 * http://localhost:9090/hello
	 */
	@GetMapping("/hello")
	public BaseResponse hello() {
		logger.info("hello");
		return BaseResponse.success("Hello greetings from spring-boot2-distributed-lock");
	}

	/**
	 * http://localhost:9090/test
	 */
	@GetMapping("test")
	public BaseResponse test() throws InterruptedException {
		Lock lock = this.redisLockRegistry.obtain("lock");
		boolean b1 = lock.tryLock(3, TimeUnit.SECONDS);
		logger.info("b1 is : {}", b1);

		TimeUnit.SECONDS.sleep(5);

		boolean b2 = lock.tryLock(3, TimeUnit.SECONDS);
		logger.info("b2 is : {}", b2);

		boolean b3 = lock.tryLock(3, TimeUnit.SECONDS);
		logger.info("b3 is : {}", b3);

		lock.unlock();
		lock.unlock();
		
		return BaseResponse.success();
	}
}