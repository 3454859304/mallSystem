package com.pjy.mallsystem.product;

import com.pjy.mallsystem.common.exception.ExceptionControllerAdvice;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import javax.annotation.Resource;


@MapperScan("com/pjy/mallsystem/product/dao")
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.pjy.mallsystem.common","com.pjy.mallsystem.product"})
public class MallsystemProductApplication {

    @Resource
    public ExceptionControllerAdvice a;

    public static void main(String[] args) {
        SpringApplication.run(MallsystemProductApplication.class, args);
    }

}
