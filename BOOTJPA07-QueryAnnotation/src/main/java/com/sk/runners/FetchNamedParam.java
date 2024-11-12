package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.repository.IArtistRepo;

@Component
@Profile("fetchNamedParam")
public class FetchNamedParam implements CommandLineRunner {
	
	@Autowired
	private IArtistRepo artistRepo;
	
	@Override
	public void run(String... args) throws Exception {

		artistRepo.fetchArtistByFee(100000, 600000).forEach(System.out::println);
		System.out.println("---------------------------------------");
		
		artistRepo.fetchParamArtistByFee(100000, 600000).forEach(System.out::println);
		
		

	}

}
