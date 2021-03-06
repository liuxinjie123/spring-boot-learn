package com.dream.mybatisplus.mapper;

import com.dream.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

	public List<User> list();

	// 方法名自动对应
	public User findByName(String name);
}
