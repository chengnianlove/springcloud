package com.cheng.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/17 11:56
 */
//@SpringBootApplication
//@EnableDiscoveryClient
@SpringCloudApplication
@EnableFeignClients
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
