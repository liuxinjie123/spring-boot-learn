package com.dream.demo.controller;

import com.dream.demo.util.BaseResponse;
import com.dream.demo.util.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/hello")
	public BaseResponse hello() {
		return BaseResponse.success("Hello greetings from spring-boot2-exception");
	}

	@GetMapping("/exception")
	public BaseResponse exception() {
		int a = 10 / 0;
		return BaseResponse.error("exception，" + a);
	}

	@GetMapping("/err")
	public BaseResponse error() {
		return BaseResponse.error(ResultCode.SUCCESS_FAIL, "error错误测试");
	}
}