package com.hll.end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EndApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndApplication.class, args);
	}	
	
}
