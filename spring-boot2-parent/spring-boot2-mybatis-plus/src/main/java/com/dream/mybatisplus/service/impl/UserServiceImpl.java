package com.dream.mybatisplus.service.impl;

import com.dream.mybatisplus.mapper.UserMapper;
import com.dream.mybatisplus.entity.User;
import com.dream.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 20172462
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public List<User> list() {
		return baseMapper.list();
	}

	@Override
	public User findByName(String name) {
		return baseMapper.findByName(name);
	}

}
