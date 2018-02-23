package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudDemoControllerApplication {
//
//	@Bean
//	@LoadBalanced
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}

	public static void main(String[] args) {
		SpringApplication.run(CloudDemoControllerApplication.class, args);
	}
}
