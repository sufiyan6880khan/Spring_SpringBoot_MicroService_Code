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
		
		ApplicationContext ctx =   SpringApplication.run(Bootjpa01CrudOperationApplication.class, args);
		
		IArtistService service = ctx.getBean("artistService", ImpArtistService.class );
		
		Artist art = new Artist();
		art.setAname("Alex");art.setAtype("singer");art.setFee(300000.0);
		
		
		String result = service.resisterAtrtist(art);
	
		System.out.println(result);
	
	   ((ConfigurableApplicationContext)ctx).close();
		
	}
                                  	
}
