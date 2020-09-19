package com.dream.service.impl;

import com.dream.dto.GetByIdDTO;
import com.dream.vo.UserVO;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.dream.service.IUserService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

	@Override
	public UserVO getUserById(GetByIdDTO dto) {
		// 模拟数据
		UserVO obj = new UserVO();
		obj.setUserId(dto.getId());
		obj.setNickName("hello");
		obj.setBlogUrl("http://www.baidu.com");
		obj.setWechat("wechat");

		log.info("获取成功，dto={}，返回数据obj={}", JSON.toJSONString(dto), JSON.toJSONString(obj));
		return obj;
	}

}
