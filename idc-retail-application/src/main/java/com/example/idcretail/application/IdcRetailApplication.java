package com.example.idcretail.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.idcretail")
public class IdcRetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdcRetailApplication.class, args);
	}
}