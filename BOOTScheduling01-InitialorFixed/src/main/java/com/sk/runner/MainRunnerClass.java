package com.sk.runner;


import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MainRunnerClass implements CommandLineRunner {

	
	@Override
	public void run(String... args) throws Exception {
		
		 System.out.println("MainRunnerClass completed initial setup. "+ new Date());
		
	}

}
