package com.moshang.oauth2.service.impl;

import com.moshang.cloud.entity.Menu;
import com.moshang.oauth2.service.PermissionService;
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
@Service
@Slf4j
public class PermissionServiceImpl implements PermissionService {
    @Override
    public Result<List<Menu>> getRolePermission(Integer id) {
        log.info("调用{}失败","getRolePermission");
        return Result.failure(100,"调用getRolePermission失败");
    }
}
