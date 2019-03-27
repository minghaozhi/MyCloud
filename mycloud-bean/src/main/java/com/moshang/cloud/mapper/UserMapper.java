package com.moshang.cloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moshang.cloud.entity.SysUser;


/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-25 14:00
 **/
public interface UserMapper extends BaseMapper<SysUser> {
    SysUser findByUserName(String userName);
}
