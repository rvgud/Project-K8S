package com.example.Universityeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UniversityEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityEurekaNamingServerApplication.class, args);
	}
}
