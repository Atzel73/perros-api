package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//(scanBasePackages = { "com.example.demo", "com.example.demo.controllers", "com.example.demo.models", "com.example.demo.repositories" })

@ComponentScan("com.example.demo")
@SpringBootApplication(scanBasePackages = { "com.example.demo", "com.example.demo.controllers", "com.example.demo.models", "com.example.demo.repositories" })
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

}
