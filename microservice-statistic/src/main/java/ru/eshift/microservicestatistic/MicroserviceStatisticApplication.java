package ru.eshift.microservicestatistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceStatisticApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceStatisticApplication.class, args);
    }

}
