package com.md.demo.util;

import net.sf.json.JSONObject;

public class JsonResult {
	private String code;
	private String msg;
	private Object data;

	public static JsonResult success() {
		return new JsonResult(ResultCode.SUCCESS);
	}

	public static JsonResult success(Object data) {
		return new JsonResult(ResultCode.SUCCESS, data);
	}

	public static JsonResult error() {
		return new JsonResult(ResultCode.SYSTEM_ERROR);
	}

	public static JsonResult error(ResultCode code) {
		return new JsonResult(code);
	}

	public JsonResult(ResultCode code) {
		this.setCode(code.code);
		this.setMsg(code.msg);
	}

	public JsonResult(ResultCode code, String data) {
		this.setCode(code.code);
		this.setMsg(code.msg);
		this.setData(data);
	}

	public JsonResult(ResultCode code, Object data) {
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
