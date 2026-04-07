package com.example.secondapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondappApplication {

	public static void main(String[] args) {

		//Creating the object of IOC container and the type of IOC container is ApplicationContext
		ApplicationContext context = SpringApplication.run(SecondappApplication.class, args);

		Developer obj = context.getBean(Developer.class);

		obj.build(); 
	}

}
