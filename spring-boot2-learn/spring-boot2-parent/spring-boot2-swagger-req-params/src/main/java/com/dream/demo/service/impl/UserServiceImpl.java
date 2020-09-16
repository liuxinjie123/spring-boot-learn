package com.dream.demo.service.impl;

import com.dream.demo.dto.GetByIdDTO;
import com.dream.demo.vo.UserVO;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.dream.demo.service.IUserService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

	@Override
	public UserVO getUserById(GetByIdDTO dto) {
		// 模拟数据
		UserVO obj = new UserVO();
		obj.setUserId(dto.getId());
		obj.setNickName("Minbo");
		obj.setBlogUrl("https://hemin.blog.csdn.net/");
		obj.setWechat("hemin_it");

		log.info("获取成功，dto={}，返回数据obj={}", JSON.toJSONString(dto), JSON.toJSONString(obj));
		return obj;
	}

}