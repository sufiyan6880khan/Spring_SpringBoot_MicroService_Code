package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sk.repository.IArtistRepo;

@Component
public class InsertRC implements CommandLineRunner {

	@Autowired
	private IArtistRepo artistRepo;
	
	@Override
	public void run(String... args) throws Exception {
	
		int count = artistRepo.resisterArtist( 545,"pawan", "comedian", 55000D);
		if (count == 0) 
			System.out.println("Artist is Not resistered ");
		  else 
			System.out.println("Artist is resistered ");
		
		
	}

}
