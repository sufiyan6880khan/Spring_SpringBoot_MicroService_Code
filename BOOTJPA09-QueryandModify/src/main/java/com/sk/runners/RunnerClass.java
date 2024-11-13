package com.sk.runners;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sk.repository.IArtistRepo;

@Component
public class RunnerClass implements CommandLineRunner {

	@Autowired
	private IArtistRepo artistRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
//		int count = artistRepo.hikeArtsistFeeBytype("villain", 10);
//		System.out.println("No. of artsist fee there is hiked is ::  "+count);
		
		int del = artistRepo.deleteArtistByFee(4000, 9000);
		System.out.println("No. of artist deleted is :: "+del);

	}

}
