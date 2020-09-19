package com.dream.mybatis.mapper;

import java.util.List;

import com.dream.mybatis.vo.CityVo;
import org.apache.ibatis.annotations.Mapper;

public interface CityMapper {

	public List<CityVo> list();

	public CityVo findById(Long id);

}
