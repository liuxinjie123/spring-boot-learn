package com.dream.controller;

import com.dream.util.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public BaseResponse hello() {
		return BaseResponse.success("Hello greetings from spring-boot2-mysql-mybatis-xml");
	}


}