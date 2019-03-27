package com.moshang.cloud.service;

import com.moshang.cloud.entity.SysMenu;

import java.util.List;

public interface PermissionService {
    List<SysMenu> getPermissionsByRoleId(Integer roleId);
}
