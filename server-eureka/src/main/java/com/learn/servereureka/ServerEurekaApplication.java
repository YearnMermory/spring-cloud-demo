package com.learn.servereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务
 *
 * @author yuanguoqing
 * @date 2020-08-24 00:00:00
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerEurekaApplication.class, args);
    }

}
