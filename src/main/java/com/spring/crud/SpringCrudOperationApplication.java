package com.spring.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.crud")
public class SpringCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudOperationApplication.class, args);
	}

}
