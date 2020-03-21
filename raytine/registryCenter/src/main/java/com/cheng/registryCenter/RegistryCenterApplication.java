package com.cheng.registryCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/14 14:38
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterApplication.class, args);
    }
}
