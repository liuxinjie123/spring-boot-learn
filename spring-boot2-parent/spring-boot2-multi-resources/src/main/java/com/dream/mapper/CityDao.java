package com.dream.mapper;

import java.util.List;

import com.dream.vo.CityVo;

public interface CityDao {

	public List<CityVo> list();

	public CityVo findById(Long id);

}
