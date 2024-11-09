package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("deleteByEntity")
public class DeleteByEntiti implements CommandLineRunner {

	@Autowired
	private IArtistService service; 
	
	@Override
	public void run(String... args) throws Exception {
		Artist artist = new Artist( 153,"Suresh", "Actor", 696969.0);
		System.out.println(service.deleteByEntity(artist));

		
	}

}
