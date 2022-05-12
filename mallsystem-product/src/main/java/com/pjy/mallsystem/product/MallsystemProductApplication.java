package com.pjy.mallsystem.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com/pjy/mallsystem/product/dao")
@SpringBootApplication
public class MallsystemProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallsystemProductApplication.class, args);
    }

}
