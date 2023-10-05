package com.jgvg.demo.EmployeeAPIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiDemoApplication.class, args);
	}

}
