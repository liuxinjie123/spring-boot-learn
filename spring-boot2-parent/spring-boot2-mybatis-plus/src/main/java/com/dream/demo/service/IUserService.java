package com.dream.demo.service;

import com.dream.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *  user 服务类
 * @author 20172462
 */
public interface IUserService extends IService<User> {
	/**
	 * 通过 name 查找 user 对象
	 * @param name		user name
	 * @return			user 对象
	 */
	public User findByName(String name);
}
