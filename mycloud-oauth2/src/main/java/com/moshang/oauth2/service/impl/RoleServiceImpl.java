package com.moshang.oauth2.service.impl;

import com.moshang.cloud.entity.Role;
import com.moshang.oauth2.service.RoleService;
import com.moshang.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 14:08
 **/
@Slf4j
@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public Result<List<Role>> getRoleByUserId(Integer id) {
        log.info("调用{}失败","getRoleByUserId");
        return Result.failure(100,"调用getRoleByUserId失败");
    }
}
