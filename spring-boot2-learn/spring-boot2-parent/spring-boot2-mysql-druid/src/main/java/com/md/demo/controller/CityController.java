package com.md.demo.controller;

import java.util.List;

import com.md.demo.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.md.demo.service.CityService;
import com.md.demo.vo.CityVo;

@RestController
@RequestMapping(value = "/city")
public class CityController {

	protected static Logger logger = LoggerFactory.getLogger(CityController.class);

	@Autowired
	private CityService cityService;

	/**
	 * 城市列表
	 */
	@GetMapping("/list")
	public BaseResponse listCities() {
		List<CityVo> list = cityService.list();
		return BaseResponse.success(list);
	}

	/**
	 * find city by id
	 */
	@GetMapping("/findById/{id}")
	public BaseResponse listCities(@PathVariable("id") Long id) {
		CityVo city = cityService.findById(id);
		return BaseResponse.success(city);
	}
}