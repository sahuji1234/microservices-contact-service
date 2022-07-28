package com.example.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMicroservices2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservices2Application.class, args);
	}

}
