package com.dream.controller;

import java.util.List;

import com.dream.entity.User;
import com.dream.util.BaseResponse;
import com.dream.service.IUserService;
import com.dream.util.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
