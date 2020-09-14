package com.md.demo.controller;

import javax.annotation.Resource;

import com.md.demo.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.md.demo.util.JsonResult;
import com.md.demo.util.ResultCode;

@RestController
public class StringRedisController {

	protected static Logger logger = LoggerFactory.getLogger(StringRedisController.class);

	@Resource
	private RedisUtil redisUtil;

	// 例如：http://localhost:9090/set?key=name&value=minbo英文名
	@RequestMapping("/set")
	public JsonResult setKeyAndValue(String key, String value) {
		logger.debug("访问set:key={},value={}", key, value);
		redisUtil.set(key, value);
		return new JsonResult(ResultCode.SUCCESS);
	}

	// 例如：http://localhost:9090/get?key=name
	@RequestMapping("/get")
	public JsonResult getKey(String key) {
		logger.debug("访问get:key={}", key);
		String result = (String) redisUtil.get(key);
		logger.debug("get result=" + result);
		return new JsonResult(ResultCode.SUCCESS, result);
	}
}