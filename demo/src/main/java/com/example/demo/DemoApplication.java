package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {		
		System.out.println("Keeping all branch");
		System.out.println("Keeping all master");
		System.out.println("stash2");
		SpringApplication.run(DemoApplication.class, args);
	}
}
