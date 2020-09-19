package com.dream.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dream.entity.User;
import com.dream.service.IUserService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dream.mapper.UserMapper;

import java.util.List;

/**
 * 服务实现类
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
//	@DS("master")
	@DS("slave_1")
	public List<User> list() {
		return baseMapper.list();
	}

}
