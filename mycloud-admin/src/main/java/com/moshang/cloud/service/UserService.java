package com.moshang.cloud.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.moshang.cloud.entity.SysUser;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:56
 **/
public interface UserService extends IService<SysUser> {
    JSONObject findByUsername(String username);

    SysUser findByName(String username);
}
