package com.cheng.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/20 11:43
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
public class HystrixDashBoard {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard.class, args);
    }
}
