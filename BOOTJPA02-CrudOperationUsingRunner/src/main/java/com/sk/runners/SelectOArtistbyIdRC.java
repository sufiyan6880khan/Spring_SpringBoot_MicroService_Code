package com.sk.runners;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("selectOById")
public class SelectOArtistbyIdRC implements CommandLineRunner {


	@Autowired
	private IArtistService service;  
	
	@Override
	public void run(String... args) throws Exception {
		

		 try {
		 
			 Optional<Artist> opt = service.showOArtistbyId(2);
			 if (opt.isPresent()) {
				         Artist artist = opt.get();
				        System.out.println("Artist Info is : "+artist);
				
			} else {
                   System.out.println("Artist not found");
			}
			 
		} catch (Exception e) {
			 e.printStackTrace();
		}


	}

}
