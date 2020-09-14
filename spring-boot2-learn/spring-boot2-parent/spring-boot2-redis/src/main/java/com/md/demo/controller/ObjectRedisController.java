package com.md.demo.controller;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.md.demo.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.md.demo.util.JsonResult;
import com.md.demo.util.ResultCode;
import com.md.demo.vo.Person;

@RestController
public class ObjectRedisController {
	protected static Logger logger = LoggerFactory.getLogger(ObjectRedisController.class);

	@Resource
	private RedisUtil redisUtil;

	// 例如：http://localhost:9090/setObj?id=A001&name=minbo英文名&age=100
	@GetMapping("/setObj")
	public JsonResult setObj(Person person) {
		logger.debug("访问set：" + person.toString());
		redisUtil.set("person:" + person.getId(), person);
		return new JsonResult(ResultCode.SUCCESS);
	}

	// 例如：http://localhost:9090/getObj?id=A001
	@GetMapping("/getObj/{id}")
	public JsonResult getObj(@PathVariable("id") String id) {
		logger.debug("访问get:key id={}", id);
		Person person = (Person) redisUtil.get("person:" + id);
		String result = person.toString();
		logger.debug("get obj result=" + result);
		return new JsonResult(ResultCode.SUCCESS, person);
	}
}