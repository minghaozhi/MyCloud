package com.moshang.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-25 11:20
 **/
@RestController
public class TestController {

    @GetMapping("/user")
    public String testUser(){
        return "123";
    }
}
