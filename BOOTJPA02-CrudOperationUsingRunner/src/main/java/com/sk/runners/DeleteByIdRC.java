package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.service.IArtistService;

@Component
@Profile("deleteById")
public class DeleteByIdRC implements CommandLineRunner {

	@Autowired
	private IArtistService service;  
	
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println(service.deletebyid(352));



	}

}
