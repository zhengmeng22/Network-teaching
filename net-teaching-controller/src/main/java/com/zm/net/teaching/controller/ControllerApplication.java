package com.zm.net.teaching.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAsync
@MapperScan({"com.zm.net.teaching.commons.mapper"})
@SpringBootApplication(scanBasePackages = {"com.zm.net.teaching"})
public class ControllerApplication{
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class,args);
    }
}
