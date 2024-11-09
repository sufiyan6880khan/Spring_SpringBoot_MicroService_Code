package com.sk.runners;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile("findByIdRC")
public class FindByIdRC implements CommandLineRunner {
	
     @Autowired
	private  IArtistService service;

	@Override
	public void run(String... args) throws Exception {

		Optional<Artist>  opt =  service.findByid(356);
		if (opt.isPresent()) {
			Artist artist = opt.get();
			System.out.println(artist.getClass());
		} else {

		}
		

	}

}
