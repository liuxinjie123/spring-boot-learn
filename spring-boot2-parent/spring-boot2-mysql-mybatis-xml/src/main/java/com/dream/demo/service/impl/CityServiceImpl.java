package com.dream.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.demo.dao.CityDao;
import com.dream.demo.service.CityService;
import com.dream.demo.vo.CityVo;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;

	/**
	 * 获得城市列表
	 */
	@Override
	public List<CityVo> list() {
		return this.cityDao.list();
	}

	/**
	 * 根据id，获得某个城市
	 */
	@Override
	public CityVo findById(Long id) {
		return this.cityDao.getById(id);
	}

}