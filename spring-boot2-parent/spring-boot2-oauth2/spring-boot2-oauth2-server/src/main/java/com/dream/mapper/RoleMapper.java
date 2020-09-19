package com.dream.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dream.pojo.Role;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {

    List<Role> findByUserId(Long userId);
}
