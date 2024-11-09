package com.sk.runners;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.Artist;
import com.sk.service.IArtistService;

@Component
@Profile({"insert","update"})
public class InsertUpdateRunnerClass implements CommandLineRunner {

	@Autowired
	public IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		// TAKING IPUT FROM USER 
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter the Artist-Name");
		String name = s.nextLine();
		System.out.println("Enter the Artist-Type"); 
		String type = s.nextLine();
		System.out.println("Enter the Artist-fee");
	    Double fee =Double.parseDouble(s.nextLine());
	
		Artist art = new Artist();
		
		art.setAname(name);art.setAtype(type);art.setFee(fee);
		
		
		String result = service.resisterAtrtist(art);
	
		System.out.println(result);
	
		s.close();
	
		
	}

}
