package com.dream.mapper;

import com.dream.pojo.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import java.util.List;

public interface UserMapper {

    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                    many = @Many(select = "com.dream.mapper.RoleMapper.findByUserId"))
    })
    User findByUsername(String username);
}
