package com.dream.demo.mapper;

import java.util.List;

import com.dream.demo.vo.CityVo;

public interface CityDao {

	public List<CityVo> list();

	public CityVo findById(Long id);

}