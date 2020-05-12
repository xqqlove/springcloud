package com.yiwa.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayCoreApplication.class,args);
    }
}
