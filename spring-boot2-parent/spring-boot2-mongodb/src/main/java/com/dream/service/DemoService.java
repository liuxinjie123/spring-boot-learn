package com.dream.service;

import com.dream.vo.DemoEntity;

public interface DemoService {

	void add(DemoEntity demoEntity);

	void removeDemo(Long id);

	void modifyDemo(DemoEntity demoEntity);

	DemoEntity findById(Long id);
}
