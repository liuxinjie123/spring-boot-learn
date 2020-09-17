package com.dream.demo.controller;

import java.util.List;

import com.dream.demo.service.CityService;
import com.dream.demo.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream.demo.vo.CityVo;

@RestController
public class HelloController {

	protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private CityService cityService;

	/**
	 * http://localhost:9090/hello
	 */
	@GetMapping("/hello")
	public BaseResponse hello() {
		return BaseResponse.success("Hello greetings from spring-boot2-multi-resources");
	}

	/**
	 * http://localhost:9090/listCities
	 */
	@GetMapping("/listCities")
	public BaseResponse listCities() {
		List<CityVo> list = this.cityService.listCities();
		return BaseResponse.success(list);
	}

	/**
	 * http://localhost:9090/getCityById?id=1
	 */
	@GetMapping("/getCityById")
	public BaseResponse listCities(Long id) {
		CityVo obj = this.cityService.getCityById(id);
		return BaseResponse.success(obj);
	}
}