package com.moshang.cloud.service.impl;

import com.moshang.cloud.entity.SysRole;
import com.moshang.cloud.mapper.SysRoleMapper;
import com.moshang.cloud.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private SysRoleMapper roleMapper;

    @Override
    public List<SysRole> getRoleByUserId(Integer userId) {
        return roleMapper.getRoleByUserId(userId);
    }
}
