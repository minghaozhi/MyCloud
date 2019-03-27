package com.moshang.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @program: MyCloud
 * @description: 验证
 * @author: moshang
 * @create: 2019-03-25 11:20
 **/
@RestController
public class UserController {
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
