package com.dream.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dream.pojo.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import java.util.List;

public interface OAuthUserMapper extends BaseMapper<User> {


    User findByUsername(String username);
}
