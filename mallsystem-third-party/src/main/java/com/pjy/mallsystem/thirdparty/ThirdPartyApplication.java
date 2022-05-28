package com.pjy.mallsystem.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDiscoveryClient
@RefreshScope
@SpringBootApplication(scanBasePackages = {"com.pjy.mallsystem.common","com.pjy.mallsystem.thirdparty"})
public class ThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdPartyApplication.class, args);
    }

}
