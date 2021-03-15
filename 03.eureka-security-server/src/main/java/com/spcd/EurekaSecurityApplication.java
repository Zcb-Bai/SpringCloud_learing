package com.spcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类.
 *
 * @author zcb 2021/3/15
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSecurityApplication.class, args);
    }
}
