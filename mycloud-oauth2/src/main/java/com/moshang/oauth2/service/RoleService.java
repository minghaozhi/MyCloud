package com.moshang.oauth2.service;

import com.moshang.cloud.entity.Role;
import com.moshang.oauth2.service.impl.RoleServiceImpl;
import com.moshang.util.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:43
 **/
@FeignClient(name = "mycloud-admin",fallback = RoleServiceImpl.class)
public interface RoleService {
    @GetMapping("role/getRoleByUserId/{userId}")
    Result<List<Role>> getRoleByUserId(Integer id);
}
