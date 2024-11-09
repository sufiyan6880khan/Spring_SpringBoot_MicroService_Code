package com.sk;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sk.sbeans.WeekMessage;

@SuppressWarnings("unused")
@SpringBootApplication
public class BootioCproject02WeekMessageApplication 
{
	@Bean("ldate")
	public LocalDate createWeak() {

		return LocalDate.now();
	}


	public static void main(String[] args) 
	{
		
	     ApplicationContext ctx = 	SpringApplication.run(BootioCproject02WeekMessageApplication.class, args);
	     
	     WeekMessage message  = ctx.getBean("wkm",WeekMessage.class );
	     
	     String msg = message.getMessage();
	     
	     System.out.println(msg);
	 

	}

}
