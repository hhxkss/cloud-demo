package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.demo.dao")
public class CloudDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDemoServiceApplication.class, args);
	}
}
