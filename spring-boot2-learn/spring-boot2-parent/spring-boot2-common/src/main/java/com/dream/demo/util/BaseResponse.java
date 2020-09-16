package com.dream.demo.util;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BaseResponse {
	public String code;
	public String msg;
	public Object data;

	public static BaseResponse success() {
		return new BaseResponse(ResultCode.SUCCESS);
	}

	public static BaseResponse success(Object data) {
		return new BaseResponse(ResultCode.SUCCESS, data);
	}

	public static BaseResponse error() {
		return new BaseResponse(ResultCode.SYSTEM_ERROR);
	}

	public static BaseResponse error(ResultCode code) {
		return new BaseResponse(code);
	}

	public BaseResponse(ResultCode code) {
		this.code = code.code;
		this.msg = code.msg;
	}

	public BaseResponse(ResultCode code, String data) {
		this.code = code.code;
		this.msg = code.msg;
		this.data = data;
	}

	public BaseResponse(ResultCode code, Object data) {
		this.code = code.code;
		this.msg = code.msg;
		this.data = data;
	}

	public String toJsonString() {
		return JSONObject.toJSONString(this);
	}
}
