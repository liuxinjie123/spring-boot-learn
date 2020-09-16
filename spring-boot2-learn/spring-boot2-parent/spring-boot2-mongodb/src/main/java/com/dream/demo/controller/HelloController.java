package com.dream.demo.controller;

import com.dream.demo.service.DemoService;
import com.dream.demo.util.BaseResponse;
import com.dream.demo.vo.DemoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private static Logger logger = LoggerFactory.getLogger(HelloController.class);

	/**
	 * http://localhost:9090/hello
	 */
	@GetMapping("/hello")
	public BaseResponse hello() {
		logger.info("hello");
		return BaseResponse.success("Hello greetings from spring-boot2-mongodb");
	}


}