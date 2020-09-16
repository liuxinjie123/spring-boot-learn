package com.dream.demo.test.service.impl;

import com.dream.demo.test.dao.UserMapper;
import com.dream.demo.test.entity.vo.User;
import com.dream.demo.test.service.IUserService;
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
