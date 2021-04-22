package com.library;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 扯淡
 */
@SpringBootApplication
@MapperScan("com.library.service")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
