package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("selectBulk")
public class SelectBulkArtistRC implements CommandLineRunner {

	@Autowired
	private IArtistService service;

	@Override
	public void run(String... args) throws Exception {
	
		Iterable<Artist> artist = service.showAllArtist();
		artist.forEach(art->{ 
			System.out.println(art);
		});
	}

} 
