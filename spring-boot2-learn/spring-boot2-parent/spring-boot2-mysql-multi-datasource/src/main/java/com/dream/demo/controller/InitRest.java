package com.dream.demo.controller;

import java.util.List;

import com.dream.demo.service.CityService;
import com.dream.demo.util.JsonResult;
import com.dream.demo.util.ResultCode;
import com.dream.demo.vo.CityVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitRest {

	protected static Logger logger = LoggerFactory.getLogger(InitRest.class);

	@Autowired
	private CityService cityService;

	/**
	 * http://localhost:9090/hello
	 * 
	 * @return
	 */
	@GetMapping("/hello")
	public String hello() {
		return "Hello greetings from spring-boot2-mysql-multi-datasource";
	}

	/**
	 * http://localhost:9090/listCities111
	 * 
	 * @return
	 */
	@GetMapping("/listCities111")
	public JsonResult listCities111() {
		List<CityVo> list = this.cityService.listCities111();
		return new JsonResult(ResultCode.SUCCESS, list);
	}

	/**
	 * http://localhost:9090/listCities222
	 * 
	 * @return
	 */
	@GetMapping("/listCities222")
	public JsonResult listCities222() {
		List<CityVo> list = this.cityService.listCities222();
		return new JsonResult(ResultCode.SUCCESS, list);
	}
}