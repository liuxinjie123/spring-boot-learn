package com.dream.demo.controller;

import com.dream.demo.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/hello")
	public BaseResponse hello() {
		logger.info("hello");
		return BaseResponse.success("Hello greetings from spring-boot2-logback");
	}
}