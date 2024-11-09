package com.sk.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("deleteAllByEntity")
public class DeleteAllByEntities implements CommandLineRunner {

	@Autowired
	public IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		Artist artist1 = new Artist(302,"Dharmesh",	"Actor",556890.0);
    	Artist artist2 = new Artist(402,"Ramesh", "Singer", 9000000.0);
    	
    	service.deleteAllbyEntity(Arrays.asList(artist1,artist2));
     	
		

	}

}
