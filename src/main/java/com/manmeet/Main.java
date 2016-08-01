package com.manmeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
// can put bean definitions in here that are executed with the booting of spring.
    // http://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

}
