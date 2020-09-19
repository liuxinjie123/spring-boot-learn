package com.dream.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dream.mapper.OAuthUserMapper;
import com.dream.pojo.User;
import com.dream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<OAuthUserMapper, User> implements UserService {
    @Autowired
    private OAuthUserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userMapper.findByUsername(username);
    }




}
