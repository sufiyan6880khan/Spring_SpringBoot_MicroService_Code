package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("selectArtistById")
public class selectArtistArtistbyIdRC implements CommandLineRunner {
	

	@Autowired
	private IArtistService service;  

	@Override
	public void run(String... args) throws Exception {

	try {
		
		Artist artist = service.fetchArtistById(12);
		System.out.println(artist);
		
	} catch (Exception e) {
	     e.printStackTrace();
	}

	}

}
