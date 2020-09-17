package com.dream.demo.controller;

import javax.validation.Valid;

import com.dream.demo.controller.base.BaseDTO;
import com.dream.demo.util.BaseResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream.demo.dto.GetUserByIdDTO;
import com.dream.demo.exception.ParamaErrorException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/")
@Api(tags = { "查询接口" })
@Slf4j
public class GetController {

	/**
	 * 测试Post请求
	 */
	@ApiOperation(value = "TestPost接口", httpMethod = "POST")
	@PostMapping("/test/post")
	public BaseResponse testPost(@Valid @RequestBody BaseDTO<GetUserByIdDTO> dto) {
		log.debug("enter test post api...");
		return BaseResponse.success();
	}

	/**
	 * 测试Get请求
	 */
	@Validated
	@ApiOperation(value = "TestGet接口", httpMethod = "GET")
	@GetMapping("/test/get/{userName}")
	public BaseResponse testGet(@PathVariable String userName) {
		log.debug("enter test get api...");
		if (userName == null || "".equals(userName)) {
			throw new ParamaErrorException("userName 不能为空");
		}
		return BaseResponse.success();
	}

}