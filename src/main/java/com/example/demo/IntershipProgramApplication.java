package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages= {"com"})


public class IntershipProgramApplication {
	public static void main(String[] args) {
		SpringApplication.run(IntershipProgramApplication.class, args);
	}

}
