package com.md.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitRestController {

	protected static Logger logger = LoggerFactory.getLogger(InitRestController.class);

	/**
	 * http://localhost:9090/hello
	 */
	@GetMapping("/hello")
	public String hello() {
		return "Hello greetings from spring-boot2-tomcat";
	}

	/**
	 * http://localhost:9090/getUserInfo?userId=minbo
	 * 
	 * @param userId
	 * @return
	 */
	@GetMapping("/getUserInfo")
	public String getUserInfo(String userId) {
		return "getUserInfo from userId=" + userId;
	}
}