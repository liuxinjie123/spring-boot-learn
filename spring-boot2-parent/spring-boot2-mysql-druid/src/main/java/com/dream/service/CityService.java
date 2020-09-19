package com.dream.service;

import java.util.List;

import com.dream.vo.CityVo;

public interface CityService {

	public List<CityVo> list();

	public CityVo findById(Long id);
}
