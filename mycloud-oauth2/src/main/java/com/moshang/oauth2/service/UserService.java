package com.moshang.oauth2.service;

import com.moshang.cloud.entity.vo.UserVo;
import com.moshang.oauth2.service.impl.UserServiceImpl;
import com.moshang.util.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:43
 **/
@FeignClient(name = "mycloud-admin",fallback = UserServiceImpl.class)
public interface UserService {
    @GetMapping("user/findByUsername/{username}")
    Result<UserVo> findByUsername(@PathVariable("username")String username);
    @GetMapping("user/findByName")
    Result findByName(@RequestParam("username") String name);
}
