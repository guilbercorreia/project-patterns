package com.project.integrationviacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IntegrationViacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationViacepApplication.class, args);
	}

}
