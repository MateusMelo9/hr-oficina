package com.devmelo.hroficina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrOficinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrOficinaApplication.class, args);
	}

}
