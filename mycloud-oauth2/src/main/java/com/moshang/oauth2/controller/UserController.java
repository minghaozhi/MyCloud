package com.moshang.oauth2.controller;

import com.moshang.cloud.entity.SysUser;
import com.moshang.cloud.entity.vo.UserVo;
import com.moshang.oauth2.service.UserService;
import com.moshang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.security.Principal;

/**
 * @program: MyCloud
 * @description: 验证
 * @author: moshang
 * @create: 2019-03-25 11:20
 **/
@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/user")
    public Result user(Principal user) {
        return userService.findByName(user.getName());
    }
}
