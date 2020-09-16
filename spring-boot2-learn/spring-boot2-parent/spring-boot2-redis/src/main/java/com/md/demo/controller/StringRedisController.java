package com.md.demo.controller;

import javax.annotation.Resource;

import com.md.demo.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.md.demo.util.BaseResponse;

@RestController
public class StringRedisController {

	protected static Logger logger = LoggerFactory.getLogger(StringRedisController.class);

	@Resource
	private RedisUtil redisUtil;

	/**
	 * set string
	 * @param key		key
	 * @param value		value
	 * @return
	 */
	@GetMapping("/set")
	public BaseResponse setKeyAndValue(String key, String value) {
		logger.info(" request, set:key={},value={}", key, value);
		redisUtil.set(key, value);
		return BaseResponse.success();
	}

	/**
	 * get string
	 * @param key		key
	 * @return
	 */
	@GetMapping("/get")
	public BaseResponse getKey(String key) {
		logger.info(" request, get:key={}.", key);
		String result = (String) redisUtil.get(key);
		logger.info(" get result={}." + result);
		return BaseResponse.success(result);
	}

	@GetMapping("/hset")
	public BaseResponse hSetKey(String key, String item, String value) {
		logger.debug(" request get:key={}, item={}, value={}.", key, item, value);
		redisUtil.hset(key, item, value);
		return BaseResponse.success();
	}


	@GetMapping("/hget")
	public BaseResponse hGetKey(String key, String item) {
		logger.debug("访问get:key={}, item={}.", key, item);
		Object object =  redisUtil.hget(key, item);
		logger.debug("get result=" + object);
		return BaseResponse.success(object);
	}
}