package com.iotek.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication

public class IotekCustomerConsumerApplication {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
         return  new RestTemplate();
    }

	public static void main(String[] args) {
		SpringApplication.run(IotekCustomerConsumerApplication.class, args);
	}
}
