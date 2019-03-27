package com.moshang.oauth2.service;

import com.moshang.cloud.entity.Menu;
import com.moshang.oauth2.config.FeignOauth2RequestInterceptor;
import com.moshang.oauth2.service.impl.PermissionServiceImpl;
import com.moshang.util.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:44
 **/
@FeignClient(name = "mycloud-admin",fallback = PermissionServiceImpl.class,configuration = FeignOauth2RequestInterceptor.class)
public interface PermissionService {
    @GetMapping("permission/getRolePermission/{roleId}")
    Result<List<Menu>> getRolePermission(Integer id);
}
