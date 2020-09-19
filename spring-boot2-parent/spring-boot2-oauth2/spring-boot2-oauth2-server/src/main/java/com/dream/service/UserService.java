package com.dream.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dream.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService, IService<User> {
}
