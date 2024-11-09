package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;
import com.sk.service.ImpArtistService;

@SpringBootApplication
public class Bootjpa01CrudOperationApplication {

	public static void main(String[] args) 
	{
		  
		  SpringApplication.run(Bootjpa01CrudOperationApplication.class, args);        
		  
	}
                                  	
}
 