package com.yiwa.configcenter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 开启配置服务
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCoreApplication.class,args);
    }
}
