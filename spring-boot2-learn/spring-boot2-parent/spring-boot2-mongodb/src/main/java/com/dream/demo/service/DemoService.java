package com.dream.demo.service;

import com.dream.demo.vo.DemoEntity;

public interface DemoService {

	void addDemo(DemoEntity demoEntity);

	void removeDemo(Long id);

	void modifyDemo(DemoEntity demoEntity);

	DemoEntity findDemoById(Long id);
}
