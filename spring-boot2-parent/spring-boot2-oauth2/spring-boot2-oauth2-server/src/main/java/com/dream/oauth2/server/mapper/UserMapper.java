package com.dream.oauth2.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dream.oauth2.server.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    @Select("select * from oauth_user WHERE username=#{username} limit 1")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                    many = @Many(select = "com.dream.oauth2.server.mapper.RoleMapper.findByUserId"))
    })
    User findByUsername(@Param("username") String username);
}
