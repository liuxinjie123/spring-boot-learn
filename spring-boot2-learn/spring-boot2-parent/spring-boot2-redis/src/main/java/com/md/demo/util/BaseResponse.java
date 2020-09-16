package com.md.demo.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.sf.json.JSONObject;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BaseResponse {
	private String code;
	private String msg;
	private Object data;

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
		this.setCode(code.code);
		this.setMsg(code.msg);
	}

	public BaseResponse(ResultCode code, String data) {
		this.setCode(code.code);
		this.setMsg(code.msg);
		this.setData(data);
	}

	public BaseResponse(ResultCode code, Object data) {
		this.setCode(code.code);
		this.setMsg(code.msg);
		this.setData(data);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String toJsonString() {
		JSONObject json = JSONObject.fromObject(this);
		return json.toString();
	}
}
