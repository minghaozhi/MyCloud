package com.moshang.cloud.controller;

import com.moshang.cloud.entity.SysUser;
import com.moshang.cloud.service.UserService;
import com.moshang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("findByUsername/{username}")
    public Result findByUsername(@PathVariable("username") String username){
        SysUser user = userService.findByUsername(username);
        if (user == null){
            return Result.failure(100,"用户不存在");
        }
        return Result.ok().setData(user);
    }
}
