package com.dream.demo.service.impl;

import com.dream.demo.test.dao.UserMapper;
import com.dream.demo.entity.User;
import com.dream.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * @author 20172462
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public User findByName(String name) {
		return this.baseMapper.findByName(name);
	}

}
