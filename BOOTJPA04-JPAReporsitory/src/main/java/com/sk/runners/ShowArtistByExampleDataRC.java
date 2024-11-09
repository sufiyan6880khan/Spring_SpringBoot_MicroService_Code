package com.sk.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("showArtistByExampleData")
public class ShowArtistByExampleDataRC implements CommandLineRunner {

	@Autowired
	private IArtistService service;

	
	
	
	@Override
	public void run(String... args) throws Exception {
     List<Artist> list = service.showArtistByExampleData("suresh", 543223);
     list.forEach(System.out::println);

	}

}
