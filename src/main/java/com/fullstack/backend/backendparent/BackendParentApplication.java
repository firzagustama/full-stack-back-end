package com.fullstack.backend.backendparent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BackendParentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendParentApplication.class, args);
	}

}
