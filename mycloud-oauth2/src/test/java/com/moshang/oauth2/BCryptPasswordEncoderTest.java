package com.moshang.oauth2;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author xww
 * Created on 2019/4/28.
 */
public class BCryptPasswordEncoderTest {

    /**
     * 加密
     */
    @Test
    public  void BCryptPassword(){
        String password="123456";
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
        System.out.println(encoder.encode(password));


    }

    /**
     * 校验
     */
    @Test
    public  void verify(){
        String password="123456";
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
        boolean flag = encoder.matches(password, "$2a$10$M17TE5layM8oBu6xyKBfIeIk8iUG5Bz6gpdN50jswyVrZxTvtqTLW");
        System.out.println(flag);


    }
}
