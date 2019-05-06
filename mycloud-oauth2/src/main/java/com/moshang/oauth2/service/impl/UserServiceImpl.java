package com.moshang.oauth2.service.impl;

import com.moshang.cloud.entity.SysUser;
import com.moshang.cloud.entity.vo.UserVo;
import com.moshang.oauth2.service.UserService;
import com.moshang.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:49
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public Result<UserVo> findByUsername(String username) {
        log.info("调用{}失败","findByUsername");
        return Result.failure(500,"调用findByUsername接口失败"+username);
    }

    @Override
    public Result findByName(String username) {
        log.info("调用{}失败","findByName");
        return Result.failure(500,"调用findByName接口失败"+username);
    }
}
