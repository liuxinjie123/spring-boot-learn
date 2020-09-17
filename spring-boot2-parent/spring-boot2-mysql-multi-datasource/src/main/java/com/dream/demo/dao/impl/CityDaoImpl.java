package com.dream.demo.dao.impl;

import java.util.List;

import com.dream.demo.dao.CityDao;
import com.dream.demo.dao.base.BaseDao;
import com.dream.demo.vo.CityVo;
import org.springframework.stereotype.Component;

@Component
public class CityDaoImpl extends BaseDao implements CityDao {

	@Override
	public List<CityVo> listCities111() {
		return this.sqlSessionTemplateOfMaster.selectList("listCities111");
	}

	@Override
	public List<CityVo> listCities222() {
		return this.sqlSessionTemplateOfSlave.selectList("listCities222");
	}

}
