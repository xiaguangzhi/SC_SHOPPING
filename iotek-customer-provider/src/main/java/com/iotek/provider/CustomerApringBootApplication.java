package com.iotek.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.iotek.provider.dao")
@EnableSwagger2
@EnableDiscoveryClient
public class CustomerApringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApringBootApplication.class, args);
	}
}
