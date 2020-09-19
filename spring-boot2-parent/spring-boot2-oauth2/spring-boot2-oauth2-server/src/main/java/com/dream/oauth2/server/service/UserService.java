package com.dream.oauth2.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dream.oauth2.server.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService, IService<User> {
}
