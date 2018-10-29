package com.hsbc.idcretail.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hsbc.idcretail")
public class IdcRetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdcRetailApplication.class, args);
	}
}