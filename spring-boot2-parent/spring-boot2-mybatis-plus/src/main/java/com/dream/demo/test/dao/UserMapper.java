package com.dream.demo.test.dao;

import com.dream.demo.test.entity.vo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface UserMapper extends BaseMapper<User> {
	// 方法名自动对应
	public User findByName(String name);
}
