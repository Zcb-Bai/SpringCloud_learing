package com.spcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类.
 *
 * @author zcb 2021/3/15
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonServiceApplicatio {
    public static void main(String[] args) {
        SpringApplication.run(RibbonServiceApplicatio.class, args);
    }
}
