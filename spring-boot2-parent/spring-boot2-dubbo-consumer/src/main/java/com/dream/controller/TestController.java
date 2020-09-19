package com.dream.controller;

import com.dream.service.DemoService;
import com.dream.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用的 Controller 类；
 */
@RestController
public class TestController {

	@Autowired
	private DemoService demoService;

	/**
	 * 测试 JSON 接口；
	 */
	@GetMapping("/test")
	public BaseResponse testJson(String name) {
		String result = this.demoService.sayHello(name);
		return BaseResponse.success(result);
	}
}