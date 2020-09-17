package com.dream.demo.controller;

import com.dream.demo.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class HelloController {

	protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

	/**
	 * http://localhost:9090/hello
	 * 
	 * @return
	 */
	@GetMapping("/hello")
	public BaseResponse hello() {
		logger.info("hello");
		return BaseResponse.success("Hello greetings from spring-boot2-valid");
	}

	/**
	 * http://localhost:9090/exception
	 */
	@ApiOperation(value = "异常测试", httpMethod = "GET")
	@GetMapping("/exception")
	public String exception() {
		int a = 10 / 0;
		return "exception，" + a;
	}
}