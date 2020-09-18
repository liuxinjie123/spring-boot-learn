package com.dream.demo.mapper.impl;

import java.util.List;

import com.dream.demo.mapper.CityDao;
import com.dream.demo.mapper.base.BaseDao;
import com.dream.demo.vo.CityVo;
import org.springframework.stereotype.Component;

@Component
public class CityDaoImpl extends BaseDao implements CityDao {

	@Override
	public List<CityVo> list1() {
		return sqlSessionTemplateOfMaster.selectList("list1");
	}

	@Override
	public List<CityVo> list2() {
		return sqlSessionTemplateOfSlave.selectList("list2");
	}

}