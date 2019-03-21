package com.moshang.cloud;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: MyCloud
 * @description: ${description}
 * @author: moshang
 * @create: 2019-03-21 10:46
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagerServer
public class MycloudTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycloudTransactionApplication.class, args);
    }

}
