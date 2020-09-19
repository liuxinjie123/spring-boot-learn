package com.dream.service;

import com.dream.dto.GetByIdDTO;
import com.dream.vo.UserVO;

/**
 * 用户信息中心
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
