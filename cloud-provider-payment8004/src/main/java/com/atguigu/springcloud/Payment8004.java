package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: thirteenmj
 * @Date: 2021/1/31 11:35
 */
@SpringBootApplication
@EnableDiscoveryClient//该注解用于向使用consul或者zookeeper作为注册中心注册服务
public class Payment8004 {

    public static void main(String[] args) {

        SpringApplication.run(Payment8004.class, args);

    }
}
