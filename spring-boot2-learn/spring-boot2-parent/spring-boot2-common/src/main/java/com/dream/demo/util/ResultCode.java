package com.dream.demo.util;

public enum ResultCode {

	/** 成功 */
	SUCCESS("200", "SUCCESS"),

	/** 数据为空 */
	SUCCESS_NO_DATA("201", "数据为空"),

	/** 用户不存在 */
	SUCCESS_NO_USER("202", "用户不存在"),

	/** 今天的量已经跑光了 */
	SUCCESS_ALL_GONE("203", "今天的量已经跑光了"),

	/** 失败，请重试 */
	SUCCESS_FAIL("204", "失败，请重试"),

	// 系统异常
	SYSTEM_ERROR("111111", "网络异常，请稍后再试");

	private ResultCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String code;
	public String msg;

}
