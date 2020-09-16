package com.dream.demo.service;

import java.util.List;
import com.dream.demo.vo.CityVo;

public interface CityService {

	public List<CityVo> listCities();

	public CityVo getCityById(Long id);
}
