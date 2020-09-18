package com.dream.demo.dao;

import java.util.List;

import com.dream.demo.vo.CityVo;

public interface CityDao {

	public List<CityVo> list();

	public CityVo findById(Long id);

}
