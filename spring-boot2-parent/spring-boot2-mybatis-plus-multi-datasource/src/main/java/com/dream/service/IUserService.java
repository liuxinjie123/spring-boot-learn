package com.dream.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dream.entity.User;

import java.util.List;

/**
 * 服务类
 */
public interface IUserService extends IService<User> {

	@Override
	public List<User> list();


}
