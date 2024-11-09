package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.service.IArtistService;

@Component
@Profile("showArtistBySorting")
public class ShowArtistBySortingRC implements CommandLineRunner {

	@Autowired
	public IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {
	
		try {
			
			service.showArtistBySorting(false, "aname").forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
