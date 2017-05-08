package com.boot.telemetry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication (scanBasePackages={"com.boot.telemetry"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
class Main{

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
