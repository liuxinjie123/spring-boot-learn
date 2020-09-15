package com.md.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.md.core.leafid.MdIdsGen;
import com.md.demo.util.JsonResult;
import com.md.demo.util.ResultCode;

@RestController
public class InitController {

	protected static Logger logger = LoggerFactory.getLogger(InitController.class);

	/**
	 * http://localhost:9090/hello
	 */
	@GetMapping("/hello")
	public String hello() {
		return "Hello greetings from spring-boot2-distributed-id";
	}

	/**
	 * http://localhost:9090/getNewId
	 */
	@GetMapping("/getNewId")
	public JsonResult getNewId() {
		Long id = MdIdsGen.getId();
		return new JsonResult(ResultCode.SUCCESS, id);
	}
}