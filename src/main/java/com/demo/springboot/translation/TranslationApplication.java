package com.demo.springboot.translation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.demo.springboot.translation.mapper"})
public class TranslationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TranslationApplication.class, args);
    }

}