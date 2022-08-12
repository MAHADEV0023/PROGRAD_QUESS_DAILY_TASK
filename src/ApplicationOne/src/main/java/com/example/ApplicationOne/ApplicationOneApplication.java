package com.example.ApplicationOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApplicationOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationOneApplication.class, args);
	}

}
