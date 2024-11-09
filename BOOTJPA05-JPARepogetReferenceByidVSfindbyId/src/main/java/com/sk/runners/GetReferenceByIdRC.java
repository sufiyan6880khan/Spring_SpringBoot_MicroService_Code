package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;


@Component
@Profile("getReferenceByIdRC")
public class GetReferenceByIdRC implements CommandLineRunner {

	   @Autowired
		private  IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {
	
		Artist artist = service.getReferenceByid(356);
		System.out.println(artist.getClass());
		System.out.println(artist.getId());
		System.out.println(artist.getAname());
	}

}
