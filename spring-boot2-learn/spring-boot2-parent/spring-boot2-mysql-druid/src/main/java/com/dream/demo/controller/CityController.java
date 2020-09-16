package com.dream.demo.controller;

import java.util.List;

import com.dream.demo.service.CityService;
import com.dream.demo.vo.CityVo;
import com.dream.demo.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/city")
public class CityController {

	protected static Logger logger = LoggerFactory.getLogger(CityController.class);

	@Autowired
	private CityService cityService;

	/**
	 * 城市列表
	 */
	@GetMapping
	public BaseResponse list() {
		List<CityVo> list = cityService.list();
		return BaseResponse.success(list);
	}

	/**
	 * find city by id
	 */
	@GetMapping("/{id}")
	public BaseResponse findById(@PathVariable("id") Long id) {
		CityVo city = cityService.findById(id);
		return BaseResponse.success(city);
	}
}