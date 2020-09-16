package com.dream.demo.service;

import com.dream.demo.vo.DemoEntity;

public interface DemoService {

	void add(DemoEntity demoEntity);

	void removeDemo(Long id);

	void modifyDemo(DemoEntity demoEntity);

	DemoEntity findById(Long id);
}
