package com.moshang.oauth2.service;

import com.moshang.cloud.entity.User;
import com.moshang.cloud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-25 13:48
 **/
@Service("userDetailService")
public class MyUserDetailService implements   UserDetailsService  {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user=null;
                user= userMapper.findByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException(userName);
        }

        User users = new User(user.getUserName(), user.getPassword(),user.getSalt(),user.getLocked());
        return (UserDetails) users;
    }
}
