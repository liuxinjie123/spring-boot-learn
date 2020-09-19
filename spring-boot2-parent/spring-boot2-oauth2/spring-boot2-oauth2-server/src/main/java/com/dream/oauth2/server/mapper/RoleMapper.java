package com.dream.oauth2.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dream.oauth2.server.pojo.Role;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {

    List<Role> findByUserId(Long userId);
}
