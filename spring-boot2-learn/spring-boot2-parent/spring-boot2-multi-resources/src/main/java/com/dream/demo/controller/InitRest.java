package com.dream.demo.controller;

import java.util.List;

import com.dream.demo.service.CityService;
import com.dream.demo.util.JsonResult;
import com.dream.demo.util.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream.demo.vo.CityVo;

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
		return "Hello greetings from spring-boot2-multi-resources";
	}

	/**
	 * http://localhost:9090/listCities
	 * 
	 * @return
	 */
	@GetMapping("/listCities")
	public JsonResult listCities() {
		List<CityVo> list = this.cityService.listCities();
		return new JsonResult(ResultCode.SUCCESS, list);
	}

	/**
	 * http://localhost:9090/getCityById?id=1
	 * 
	 * @return
	 */
	@GetMapping("/getCityById")
	public JsonResult listCities(Long id) {
		CityVo obj = this.cityService.getCityById(id);
		return new JsonResult(ResultCode.SUCCESS, obj);
	}
}