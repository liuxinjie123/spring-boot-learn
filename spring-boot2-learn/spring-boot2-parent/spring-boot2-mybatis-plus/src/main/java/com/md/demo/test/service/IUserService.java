package com.md.demo.test.service;

import com.md.demo.test.entity.vo.User;
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
