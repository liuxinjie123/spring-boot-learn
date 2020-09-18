package com.dream.demo.service.impl;

import com.dream.demo.mapper.DemoDao;
import com.dream.demo.vo.DemoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao demoDao;

	@Override
	public void add(DemoEntity demoEntity) {
		this.demoDao.saveDemo(demoEntity);
	}

	@Override
	public void removeDemo(Long id) {
		DemoEntity demoEntity = new DemoEntity();
		demoEntity.setId(id);
		this.demoDao.removeDemo(demoEntity);
	}

	@Override
	public void modifyDemo(DemoEntity demoEntity) {
		this.demoDao.updateDemo(demoEntity);
	}

	@Override
	public DemoEntity findById(Long id) {
		return this.demoDao.findById(id);
	}

}