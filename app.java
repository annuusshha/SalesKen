package com.example.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springboot.web")
public class SpringBootLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLoginApplication.class, args);
    }
}