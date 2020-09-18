package com.dream.demo.mapper.impl;

import java.util.List;

import com.dream.demo.mapper.CityDao;
import com.dream.demo.vo.CityVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityDaoImpl implements CityDao {

	@Autowired
	public SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<CityVo> list() {
		return this.sqlSessionTemplate.selectList("list");
	}

	@Override
	public CityVo findById(Long id) {
		return this.sqlSessionTemplate.selectOne("findById", id);
	}

}
