package com.dream.demo.test.controller;

import java.util.List;

import com.dream.demo.util.BaseResponse;
import com.dream.demo.util.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dream.demo.test.entity.vo.User;
import com.dream.demo.test.service.IUserService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 前端控制器
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@ApiOperation(value = "获得用户列表", notes = "", httpMethod = "GET")
	@GetMapping
	public BaseResponse userList() {
		// 框架自带的方法
		List<User> list = this.userService.list(null);
		return BaseResponse.success(list);
	}

	@ApiOperation(value = "根据用户名获得用户记录", notes = "名称不能为空", httpMethod = "GET")
	@ApiImplicitParam(dataType = "string", name = "name", value = "用户名", required = true)
	@RequestMapping(value = "/findByName")
	public BaseResponse findByName(@RequestParam(value = "name", required = true) String name) {
		// 自定义的方法
		User user = this.userService.findByName(name);
		return BaseResponse.success(user);
	}
}
