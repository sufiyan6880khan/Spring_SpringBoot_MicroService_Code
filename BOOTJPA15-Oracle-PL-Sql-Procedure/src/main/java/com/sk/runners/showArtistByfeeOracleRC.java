package com.sk.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistServicemgmnt;

@Component
public class showArtistByfeeOracleRC implements CommandLineRunner {

	@Autowired
	private IArtistServicemgmnt service;
	
	@Override
	public void run(String... args) throws Exception {
		
	List<Artist> list =	service.showArtistByfee(600000, 900000);
	list.forEach(System.out::println);
		

	}

}
