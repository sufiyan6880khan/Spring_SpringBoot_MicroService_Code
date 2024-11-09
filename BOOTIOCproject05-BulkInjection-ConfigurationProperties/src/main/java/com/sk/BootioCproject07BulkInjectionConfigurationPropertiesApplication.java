package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sk.sbeans.Company;

@SpringBootApplication
public class BootioCproject07BulkInjectionConfigurationPropertiesApplication {

	public static void main(String[] args) 
	{
		  //  get IOC Container
             ApplicationContext ctx = 		SpringApplication.run(BootioCproject07BulkInjectionConfigurationPropertiesApplication.class, args);
	        
             // get Spring beans class obj referenece
             Company company =  ctx.getBean("comp", Company.class);
             
             // print the result 
             System.out.println(company); 
	
	}
}
