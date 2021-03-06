package com.dream.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dream.util.HttpStatusCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream.dto.GetByIdDTO;
import com.dream.service.IUserService;
import com.dream.util.JsonResult;
import com.dream.vo.UserVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/demo")
@Api(tags = { "接口-演示" })
@Slf4j
public class DemoController extends BaseController {

	@Autowired
	private IUserService userService;

	@ApiOperation(value = "根据id获得用户信息", notes = "id不能为空", httpMethod = "POST")
	@PostMapping(value = "/getUserById")
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JsonResult<UserVO> getUserById(@Validated @RequestBody GetByIdDTO dto, BindingResult result,
			HttpServletRequest request, HttpServletResponse response) {
		// 验证参数合法性（@NotEmpty注解）
		JsonResult validResult = super.getJsonResult(dto, result);
		if (validResult != null) {
			// 设置http响应码，利于监控工具，不要统一使用200
			HttpStatusCodeUtil.setCode(response, 4403);
			return validResult;
		}

		// 获取用户ID
		String userId = request.getHeader("userId");
		log.info("获取用户ID，userId={}", userId);

		// 逻辑处理
		UserVO obj = this.userService.getUserById(dto);
		return JsonResult.ok(obj);
	}
}