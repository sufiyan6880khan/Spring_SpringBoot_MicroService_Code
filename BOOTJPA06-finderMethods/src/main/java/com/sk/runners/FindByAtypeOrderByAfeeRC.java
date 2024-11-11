package com.sk.runners;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.repositry.IArtistRepo;

@Component
@Profile("findByAnameOrderByAfee")
public class FindByAtypeOrderByAfeeRC implements CommandLineRunner {

	@Autowired
	private IArtistRepo artistRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
	   Iterator<Artist> artist =  artistRepo.findByAnameOrderByafeeAsc(List.of("suresh","ramesh"));
	   System.out.println(artist);
		
		
	}

}
