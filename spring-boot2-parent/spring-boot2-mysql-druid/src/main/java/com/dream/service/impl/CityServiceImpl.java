package com.dream.service.impl;

import java.util.List;

import com.dream.mapper.CityDao;
import com.dream.vo.CityVo;
import com.dream.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return this.cityDao.findById(id);
	}

}
