package com.moshang.oauth2;

import com.moshang.cloud.entity.SysUser;
import com.moshang.cloud.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MycloudOauth2ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
    }
    @Test
    public void select(){
        SysUser user=userMapper.findByUserName("admin");
        System.out.println(user);
    }
}
