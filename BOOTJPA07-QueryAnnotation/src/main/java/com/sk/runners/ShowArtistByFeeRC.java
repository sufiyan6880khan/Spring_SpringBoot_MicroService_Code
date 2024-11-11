package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.repository.IArtistRepo;

@Component
@Profile("showArtistByFee")
public class ShowArtistByFeeRC implements CommandLineRunner {
	
	@Autowired
	private IArtistRepo artissRepo;
	

	@Override
	public void run(String... args) throws Exception {
		
		artissRepo.showArtistByFee(100000, 600000).forEach(System.out::println);

	}

}
