package com.dream.demo.dao;

import com.dream.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface UserMapper extends BaseMapper<User> {
	// 方法名自动对应
	public User findByName(String name);
}
