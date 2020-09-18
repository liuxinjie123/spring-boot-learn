package com.dream.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.demo.mapper.CityMapper;
import com.dream.demo.service.CityService;
import com.dream.demo.vo.CityVo;

import javax.annotation.Resource;

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
