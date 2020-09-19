package com.dream.mybatisplus.service;

import com.dream.mybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *  user 服务类
 * @author 20172462
 */
public interface IUserService extends IService<User> {

	@Override
	public List<User> list();

	/**
	 * 通过 name 查找 user 对象
	 * @param name		user name
	 * @return			user 对象
	 */
	public User findByName(String name);
}
