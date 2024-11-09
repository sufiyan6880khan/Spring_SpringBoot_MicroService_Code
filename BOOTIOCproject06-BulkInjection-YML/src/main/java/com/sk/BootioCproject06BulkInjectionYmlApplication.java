package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sk.sbeans.Company;

@SpringBootApplication
public class BootioCproject06BulkInjectionYmlApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ctx =  SpringApplication.run(BootioCproject06BulkInjectionYmlApplication.class, args);
		
		Company comp = ctx.getBean("comp",Company.class);
		
		System.out.println(comp);
	} 
}
