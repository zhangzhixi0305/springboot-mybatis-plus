package com.zhixi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings("all")
@SpringBootApplication
@MapperScan("com.zhixi.mapper")
public class Springboot07MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07MybatisPlusApplication.class, args);
    }

}
