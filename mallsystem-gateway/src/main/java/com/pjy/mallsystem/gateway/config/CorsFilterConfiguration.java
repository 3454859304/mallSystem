package com.pjy.mallsystem.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsFilterConfiguration {
    @Bean // springboot自带的过滤器
    public CorsWebFilter corsWebFilter(){
        // 基于url跨域，选择reactive包下的
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        //设置一个跨域配置
        CorsConfiguration config=new CorsConfiguration();
        // 允许跨域的头
        config.addAllowedHeader("*");
        // 允许跨域的请求方式
        config.addAllowedMethod("*");
        // 允许跨域的请求来源
        config.addAllowedOrigin("*");
        // 是否允许携带cookie跨域
        config.setAllowCredentials(true);
        //注册跨域配置过滤到"/**"生效
        source.registerCorsConfiguration("/**",config);
        return new CorsWebFilter(source);
    }
}
