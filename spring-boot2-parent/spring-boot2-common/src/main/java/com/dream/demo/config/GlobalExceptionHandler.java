package com.dream.demo.config;

import com.dream.demo.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 */
@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {

	protected static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(value = {Exception.class, ArithmeticException.class})
	public BaseResponse handleException(Exception e) {
		logger.error("系统异常【全局异常】：" + e.getMessage(), e);
		return BaseResponse.error(e.getMessage());
	}
}
