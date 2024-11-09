package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("insertUpdateAdvance")
public class InseetUpdateAdvanceRC implements CommandLineRunner {

	   @Autowired
				public IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {

             try {
            	 
                 Artist artist = new Artist( 352,"Ramu Kaka", "Super-villain", 696969.0);
                 
                 String msg = service.InsertUpdateAdvanceById(artist);
                 System.out.println(msg);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
           
		
		
	}

}
