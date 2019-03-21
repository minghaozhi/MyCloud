package com.moshang.cloud;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
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
@EnableDistributedTransaction
public class MycloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycloudAdminApplication.class, args);
    }

}
