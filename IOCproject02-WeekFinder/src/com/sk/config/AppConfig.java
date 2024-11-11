package com.sk.config;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


 @ComponentScan(basePackages = "com.sk.sbeans")
public class AppConfig 
{
	@Bean(name ="ltime")
	public  LocalDateTime createDate()
	{
	  return LocalDateTime.now();
	  
	}
				
	
		
}
