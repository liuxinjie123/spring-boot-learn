package com.dream.mapper;

import com.dream.vo.DemoEntity;

public interface DemoDao {

	void saveDemo(DemoEntity demoEntity);

	void removeDemo(DemoEntity demoEntity);

	void updateDemo(DemoEntity demoEntity);

	DemoEntity findById(Long id);
}
