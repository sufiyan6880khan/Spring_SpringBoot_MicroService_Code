package com.sk.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistServicemgmnt;

@Component
public class showArtistByfeeMYSQLRC implements CommandLineRunner {

	@Autowired
	private IArtistServicemgmnt service;
	
	@Override
	public void run(String... args) throws Exception {
		
	List<Artist> list =	service.showArtistByfee(5000, 10000);
	list.forEach(System.out::println);
		

	}

}
