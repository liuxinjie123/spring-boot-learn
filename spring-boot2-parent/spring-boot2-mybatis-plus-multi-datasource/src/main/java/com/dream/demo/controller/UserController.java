package com.dream.demo.controller;

import java.util.List;

import com.dream.demo.entity.User;
import com.dream.demo.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream.demo.service.IUserService;
import com.dream.demo.util.ResultCode;

import io.swagger.annotations.ApiOperation;

/**
 * 前端控制器
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@ApiOperation(value = "获得用户列表信息", httpMethod = "POST")
	@GetMapping
	public BaseResponse userList() {
		List<User> list = userService.list();
		if (list == null || list.size() == 0) {
			return BaseResponse.success(ResultCode.SUCCESS_FAIL);
		}
		return BaseResponse.success(list);
	}
}
