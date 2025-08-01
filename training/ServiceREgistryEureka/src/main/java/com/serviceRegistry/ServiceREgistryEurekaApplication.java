package com.serviceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceREgistryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceREgistryEurekaApplication.class, args);
	}

}
