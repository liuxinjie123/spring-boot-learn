package com.dream.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.mapper.CityMapper;
import com.dream.service.CityService;
import com.dream.vo.CityVo;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;

	/**
	 * 获得城市列表
	 */
	@Override
	public List<CityVo> list() {
		return this.cityMapper.list();
	}

	/**
	 * 根据id，获得某个城市
	 */
	@Override
	public CityVo findById(Long id) {
		return this.cityMapper.findById(id);
	}

}
