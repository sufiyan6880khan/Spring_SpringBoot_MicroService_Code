package com.sk.runners;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.service.IArtistService;

@Component
@Profile("selectboolean")
public class SelectbooleanRunnerClass implements CommandLineRunner {


	@Autowired
	public IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {
	
		// TAKING ID FROM USER 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Artist-id");
		Integer id = s.nextInt();
		 
		System.out.println("Artist available or not :: " +service.checkArtist(id));
		s.close();
	}

}
