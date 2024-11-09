package com.sk;


import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sk.sbeans.WishMessageGenrator;

@SuppressWarnings( "unused" )
@SpringBootApplication
public class BootioCproject01WishMessageApplication
{
	@Bean("ldate") 
       public  LocalDateTime creteTime()
          {
    	        return LocalDateTime.now();
          }
	public static void main(String[] args) 
	{
		   ApplicationContext ctx  =   SpringApplication.run(BootioCproject01WishMessageApplication.class, args);
		   
		   WishMessageGenrator wmg1 = ctx.getBean("wmg", WishMessageGenrator.class);
		   
		   String msg = wmg1.getMessge("Sufiyan");
		   
		   System.out.println(msg);
		   
		   
	}

}
