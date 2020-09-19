package com.dream.mapper;

import java.util.List;

import com.dream.vo.CityVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {

	public List<CityVo> list();

	public CityVo findById(Long id);

}
