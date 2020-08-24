package com.learn.serviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 注册服务
 *
 * @author Han1er
 * @date 2020-08-24 00:00:00
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }

}
