package com.dream.mybatis.service;

import java.util.List;
import com.dream.mybatis.vo.CityVo;

public interface CityService {

	public List<CityVo> list();

	public CityVo findById(Long id);
}
