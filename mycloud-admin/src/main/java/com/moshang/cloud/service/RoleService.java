package com.moshang.cloud.service;


import com.moshang.cloud.entity.SysRole;

import java.util.List;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:56
 **/
public interface RoleService {
    List<SysRole> getRoleByUserId(Integer userId);
}
