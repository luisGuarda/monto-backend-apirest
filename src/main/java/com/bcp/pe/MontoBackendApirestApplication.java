package com.bcp.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class MontoBackendApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MontoBackendApirestApplication.class, args);
	}

}
