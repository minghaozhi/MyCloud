package com.moshang.cloud;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author moshang
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableDistributedTransaction
public class MycloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycloudAdminApplication.class, args);
    }

}
