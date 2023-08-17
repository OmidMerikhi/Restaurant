package com.omid.restaurantclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantClientServiceApplication.class, args);
    }

}
