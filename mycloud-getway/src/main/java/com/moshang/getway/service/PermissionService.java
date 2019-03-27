package com.moshang.getway.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 10:30
 **/
public interface PermissionService {
    boolean hasPermission(HttpServletRequest request, Authentication authentication);
}
