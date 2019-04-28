package com.moshang.oauth2;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author xww
 * Created on 2019/4/28.
 */
public class BCryptPasswordEncoderTest {


    @Test
    public  void BCryptPassword(){
        String password="123456";
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
        System.out.println(encoder.encode(password));


    }
}
