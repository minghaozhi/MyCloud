package com.moshang.cloud.controller;


import com.moshang.cloud.entity.SysRole;
import com.moshang.cloud.service.RoleService;
import com.moshang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:55
 **/
@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping("getRoleByUserId/{userId}")
    public Result getRoleByUserId(@PathVariable("userId") Integer userId){
        List<SysRole> roleList = roleService.getRoleByUserId(userId);
        return Result.ok().setData(roleList);
    }

}
