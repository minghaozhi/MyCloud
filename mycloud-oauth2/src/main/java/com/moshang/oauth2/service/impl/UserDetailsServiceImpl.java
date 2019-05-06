package com.moshang.oauth2.service.impl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moshang.cloud.entity.Menu;
import com.moshang.cloud.entity.Role;
import com.moshang.cloud.entity.vo.UserVo;
import com.moshang.oauth2.service.PermissionService;
import com.moshang.oauth2.service.RoleService;
import com.moshang.oauth2.service.UserService;
import com.moshang.util.Result;
import com.moshang.util.StatusCode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-27 13:43
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Result<UserVo> userResult = userService.findByUsername(username);
        if (userResult.getCode() != StatusCode.SUCCESS_CODE) {
            throw new UsernameNotFoundException("用户:" + username + ",不存在!");
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        boolean enabled = true; // 可用性 :true:可用 false:不可用
        boolean accountNonExpired = true; // 过期性 :true:没过期 false:过期
        boolean credentialsNonExpired = true; // 有效性 :true:凭证有效 false:凭证无效
        boolean accountNonLocked = true; // 锁定性 :true:未锁定 false:已锁定
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userResult.getData(),userVo);
        Result<List<Role>> roleResult = roleService.getRoleByUserId(userVo.getId());
        if (roleResult.getCode() != StatusCode.SUCCESS_CODE){
            List<Role> roleVoList = roleResult.getData();
            for (Role role:roleVoList){
                //角色必须是ROLE_开头，可以在数据库中设置
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_"+role.getValue());
                grantedAuthorities.add(grantedAuthority);
                //获取权限
                Result<List<Menu>> perResult  = permissionService.getRolePermission(role.getId());
                if (perResult.getCode() != StatusCode.SUCCESS_CODE){
                    List<Menu> permissionList = perResult.getData();
                    for (Menu menu:permissionList
                            ) {
                        GrantedAuthority authority = new SimpleGrantedAuthority(menu.getCode());
                        grantedAuthorities.add(authority);
                    }
                }
            }
        }
        User user = new User(userVo.getUserName(), userVo.getPassword(),
                enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuthorities);
        return user;
    }
}
