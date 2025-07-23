package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
                String message = "Hello Git";
                int age = 25;
                float sal = 76500.768f;
                boolean isEligibleForVote = true;
		SpringApplication.run(DemoApplication.class, args);
	}

}
