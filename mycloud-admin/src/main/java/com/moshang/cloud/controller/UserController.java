package com.moshang.cloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.moshang.cloud.entity.SysUser;
import com.moshang.cloud.service.RoleService;
import com.moshang.cloud.service.UserService;
import com.moshang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:55
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @GetMapping("findByUsername/{username}")
    public Result findByUsername(@PathVariable("username") String username){
        JSONObject user = userService.findByUsername(username);
        if (user == null){
            return Result.failure(100,"用户不存在");
        }
        return Result.ok().setData(user);
    }
    @GetMapping("findByName")
    public Result findByName(@RequestParam("username") String username){
        SysUser user = userService.findByName(username);
        if (user == null){
            return Result.failure(100,"用户不存在");
        }
        HashMap map=new HashMap();
        map.put("name",user.getUserName());
        map.put("avatar",user.getImage());
        map.put("roles",roleService.getRoleByUserId(user.getId()));
        return Result.ok().setData(map);
    }
}
