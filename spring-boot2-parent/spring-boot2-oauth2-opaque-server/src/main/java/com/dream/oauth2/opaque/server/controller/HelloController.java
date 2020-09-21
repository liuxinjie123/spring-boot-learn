package com.dream.oauth2.opaque.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

	/**
	 * http://localhost:9001/hello
	 * 
	 * 在WebSecurityConfiguration.java文件中，开启了忽略放行，不验证token
	 * 
	 * @return
	 */
	@GetMapping("/hello")
	public String hello() {
		logger.info("hello");
		return "Hello greetings from spring-boot2-oauth2-opaque-server";
	}
}