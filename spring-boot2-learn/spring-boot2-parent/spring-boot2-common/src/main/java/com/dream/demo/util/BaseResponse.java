package com.dream.demo.util;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

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

	public static BaseResponse error(String msg) {
		return new BaseResponse(ResultCode.SYSTEM_ERROR.code, msg);
	}

	public static BaseResponse error(ResultCode code, String data) {
		return new BaseResponse(code, data);
	}

	public static BaseResponse error(ResultCode code, Object data) {
		return new BaseResponse(code, data);
	}

	public BaseResponse(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public BaseResponse(ResultCode code) {
		this(code.code, code.msg);
	}

	public BaseResponse(ResultCode code, String data) {
		this(code.code, code.msg);
		this.data = data;
	}

	public BaseResponse(ResultCode code, Object data) {
		this(code.code, code.msg);
		this.data = data;
	}

	public String toJsonString() {
		return JSONObject.toJSONString(this);
	}
}
