package com.md.demo.test.service.impl;

import com.md.demo.test.dao.UserMapper;
import com.md.demo.test.entity.vo.User;
import com.md.demo.test.service.IUserService;
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
