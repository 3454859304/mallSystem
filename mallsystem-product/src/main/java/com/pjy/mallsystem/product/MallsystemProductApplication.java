package com.pjy.mallsystem.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@MapperScan("com/pjy/mallsystem/product/dao")
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class MallsystemProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallsystemProductApplication.class, args);
    }

}
