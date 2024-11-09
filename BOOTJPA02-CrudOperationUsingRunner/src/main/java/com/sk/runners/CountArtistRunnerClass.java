package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.service.IArtistService;

@Component
@Profile("count")
public class CountArtistRunnerClass implements CommandLineRunner {

	@Autowired
	public IArtistService service;
	 
	@Override
	@Profile("count")
	public void run(String... args) throws Exception {
	
		System.out.println("Total employee is :: "+service.countArtist());
		
	}

}
