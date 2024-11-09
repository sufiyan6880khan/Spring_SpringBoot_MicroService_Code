package com.sk.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile({"insertBulk","updateBulk"})
public class InsertUpdateInBulkRC implements CommandLineRunner {

	   @Autowired
			public IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {

		try {
			
			Artist artist1 = new Artist("RameshT", "Singer", 900000.0);
	    	Artist artist2 = new Artist("DharmeshT", "Actor", 556890.0);
	     	Artist artist3 = new Artist("KaleshT", "Dancer", 654435.0);
			
			List<Artist> artisit = List.of(artist1,artist2);
			
		          String msg =  service.resisterArtistBulk(artisit);
		          
			System.out.println(msg);
			
		}catch (Exception e) {
		         e.printStackTrace();        
		}
	}

}
