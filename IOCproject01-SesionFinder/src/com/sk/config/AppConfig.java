package com.sk.config;
import java.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sk.sbeans")
public class AppConfig {
				
	@Bean(name ="ldate")
		public  LocalDate createDate()
		{
		
		  return LocalDate.now();
		  
		}
	@Bean(name ="ld")
	public  LocalDate createTime()
	{
	  return LocalDate.now();
	  
	}

}
