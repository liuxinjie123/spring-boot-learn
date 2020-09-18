package com.dream.demo.mapper;

import com.dream.demo.vo.DemoEntity;

public interface DemoDao {

	void saveDemo(DemoEntity demoEntity);

	void removeDemo(DemoEntity demoEntity);

	void updateDemo(DemoEntity demoEntity);

	DemoEntity findById(Long id);
}
