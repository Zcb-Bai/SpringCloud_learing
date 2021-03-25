package com.spcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zcb
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigClientApplication.class, args);
    }

}
