package com.moshang.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.moshang.cloud.entity.SysUser;
import com.moshang.cloud.mapper.UserMapper;
import com.moshang.cloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:58
 **/
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, SysUser> implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public SysUser findByUsername(String username) {
        return userMapper.findByUserName(username);
    }
}
