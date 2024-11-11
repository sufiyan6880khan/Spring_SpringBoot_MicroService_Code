package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.repositry.IArtistRepo;

@Component
@Profile("findByAnameEquals")
public class FindByAnameEqualsRC implements CommandLineRunner {

	@Autowired
	private IArtistRepo artistrepo;
	
	@Override
	public void run(String... args) throws Exception {
		
	    System.out.println("==============findByAnameEquals()-Method ====================");
		artistrepo.findByAnameEquals("suresh").forEach(System.out::println);
		System.out.println("\n");
		
		 System.out.println("==============findByAnameIs()-Method ====================");
		artistrepo.findByAnameIs("Suresh").forEach(System.out::println);
		System.out.println("\n");
		
		
		 System.out.println("==============findByAname()-Method ====================");
		artistrepo.findByAname("suresh").forEach(System.out::println);

	}

}
