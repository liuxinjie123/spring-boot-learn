package com.dream.demo.config;

import com.dream.demo.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	protected static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	public BaseResponse handleException(Exception e) {
		logger.error("系统异常【全局异常】：" + e.getMessage(), e);
		return BaseResponse.error(e.getMessage());
	}
}
