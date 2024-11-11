package com.sk;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class BootScheduling01InitialorFixedApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BootScheduling01InitialorFixedApplication.class, args);
		System.out.println("Main method timing of execution : "+ new Date());

	}

}
