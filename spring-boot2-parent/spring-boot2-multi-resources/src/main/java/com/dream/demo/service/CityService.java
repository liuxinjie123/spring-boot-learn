package com.dream.demo.service;

import java.util.List;
import com.dream.demo.vo.CityVo;

public interface CityService {

	public List<CityVo> list();

	public CityVo findById(Long id);
}
