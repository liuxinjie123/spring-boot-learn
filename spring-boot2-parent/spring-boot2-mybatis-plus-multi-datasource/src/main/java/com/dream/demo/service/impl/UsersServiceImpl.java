package com.dream.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dream.demo.dao.UsersMapper;
import com.dream.demo.entity.vo.Users;
import com.dream.demo.service.IUsersService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Minbo
 * @since 2020-03-27
 */
@Service
//@DS("slave_1")
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

	@Override
//	@DS("master")
	public List<Users> listDbInfo() {
		return this.baseMapper.listDbInfo();
	}

}
