package com.sessions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SessionsApplication {


	public static void main(String[] args) {

		System.out.println("Inside the main");
		SpringApplication.run(SessionsApplication.class, args);
	}

}
