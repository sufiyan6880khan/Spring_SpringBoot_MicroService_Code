package com.sk.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.repository.IArtistRepo;

@Component
public class AggregateFunctionRC implements CommandLineRunner {

	@Autowired
	private IArtistRepo artistRepo;
	@Override
	public void run(String... args) throws Exception {


		System.out.println("Total artist unique by Name ::  "+artistRepo.fetchArtistbyName());
		System.out.println("----------------------------------");
		
		Object obj = artistRepo.fetchAggregateData();
		Object ob[] = (Object [])obj;
		System.err.println(Arrays.toString(ob));

	}

}
