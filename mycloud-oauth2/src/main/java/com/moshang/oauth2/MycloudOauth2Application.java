package com.moshang.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-22 10:11
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class MycloudOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(MycloudOauth2Application.class, args);
    }

}
