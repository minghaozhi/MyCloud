package com.moshang.cloud.service.impl;


import com.moshang.cloud.entity.SysMenu;
import com.moshang.cloud.mapper.SysMenuMapper;
import com.moshang.cloud.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private SysMenuMapper menuMapper;
    @Override
    public List<SysMenu> getPermissionsByRoleId(Integer roleId) {
        return menuMapper.getPermissionsByRoleId(roleId);
    }
}
