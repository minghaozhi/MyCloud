package com.moshang.oauth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-22 10:11
 **/
@SpringBootApplication
@EnableDiscoveryClient
//@MapperScan("com.moshang.cloud.mapper")
@EnableFeignClients
@EnableHystrix
public class MycloudOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(MycloudOauth2Application.class, args);
    }

}
