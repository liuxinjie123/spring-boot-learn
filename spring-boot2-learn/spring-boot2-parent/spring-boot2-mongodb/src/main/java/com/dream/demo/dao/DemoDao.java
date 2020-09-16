package com.dream.demo.dao;

import com.dream.demo.vo.DemoEntity;

public interface DemoDao {

	void saveDemo(DemoEntity demoEntity);

	void removeDemo(DemoEntity demoEntity);

	void updateDemo(DemoEntity demoEntity);

	DemoEntity findDemoById(Long id);
}
