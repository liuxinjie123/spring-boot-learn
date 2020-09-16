package com.dream.demo.controller;

import com.dream.demo.service.DemoService;
import com.dream.demo.util.JsonResult;
import com.dream.demo.util.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试用的 Controller 类；
 */
@Controller
public class TestController {

	@Autowired
	private DemoService demoService;

	/**
	 * 测试 JSON 接口；
	 * 
	 * @param name 名字
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/test")
	public JsonResult testJson(String name) {
		String result = this.demoService.sayHello(name);
		return new JsonResult(ResultCode.SUCCESS, result);
	}
}