package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.repositry.IArtistRepo;

@Component
@Profile("findByAtypeContainsOrNot")
public class FindByAtypeContainsOrNotRC implements CommandLineRunner {

	@Autowired
	private IArtistRepo artistRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println("================ findByAtypeStartingWith() Method ================");
		artistRepo.findByAtypeStartingWith("h").forEach(System.out::println);
	    System.out.println("\n");
	    
		System.out.println("================ findByAtypeEndingWith() Method ================");
		artistRepo.findByAtypeEndingWith("n").forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("================ findByAtypeContaining() Method ================");
		artistRepo.findByAtypeContaining("a").forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("================ findByAtypeContainingIgnoreCase() Method ================");
		artistRepo.findByAtypeContainingIgnoreCase("e").forEach(System.out::println);
	    System.out.println("\n");
		    

	}

}
