package com.sk.repositry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.service.IArtistService;

@Component
@Profile("showArtistPageByPage")
public class ShowArtistPageByPageRC implements CommandLineRunner {

	@Autowired
	private IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		service.showArtistPageByPage(3, true, "id");

	}

}
