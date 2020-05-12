package com.yiwa.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 */
@SpringBootApplication
@EnableEurekaServer  //申明这是一个eureka服务
public class EurekaCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCoreApplication.class,args);
    }
}
