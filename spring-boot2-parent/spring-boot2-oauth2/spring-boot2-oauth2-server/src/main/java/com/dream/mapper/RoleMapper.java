package com.dream.mapper;

import com.dream.pojo.Role;

import java.util.List;

public interface RoleMapper {

    List<Role> findByUserId(Long userId);
}
