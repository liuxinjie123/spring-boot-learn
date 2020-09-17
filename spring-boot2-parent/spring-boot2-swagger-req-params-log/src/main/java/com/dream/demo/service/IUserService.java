package com.dream.demo.service;

import com.dream.demo.dto.GetByIdDTO;
import com.dream.demo.vo.UserVO;

/**
 * 用户信息中心
 * 
 * @author Minbo
 *
 */
public interface IUserService {

	/**
	 * 根据id获取用户信息
	 * 
	 * @param dto
	 * @return
	 */
	public UserVO getUserById(GetByIdDTO dto);
}
