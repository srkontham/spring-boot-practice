package com.srk.myspringbootapp;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// @Configuration
// @EnableAutoConfiguration
// @ComponentScan
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@RestController
public class MySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
    
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
