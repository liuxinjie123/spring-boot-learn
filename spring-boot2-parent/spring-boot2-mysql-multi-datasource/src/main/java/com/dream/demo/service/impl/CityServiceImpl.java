package com.dream.demo.service.impl;

import java.util.List;

import com.dream.demo.mapper.CityDao;
import com.dream.demo.vo.CityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.demo.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;

	/**
	 * 获得城市1列表
	 */
	@Override
	public List<CityVo> list1() {
		return cityDao.list1();
	}

	/**
	 * 获得城市2列表
	 */
	@Override
	public List<CityVo> list2() {
		return cityDao.list2();
	}

}
