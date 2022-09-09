package com.example.microservicequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceQuizApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceQuizApplication.class, args);
    }

}
