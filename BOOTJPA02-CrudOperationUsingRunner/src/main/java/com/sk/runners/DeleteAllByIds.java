package com.sk.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.service.IArtistService;

@Component
@Profile("deleteAllByIds")
public class DeleteAllByIds implements CommandLineRunner {

	@Autowired
	private IArtistService service;
	
	@Override
	public void run(String... args) throws Exception {
	
		String msg = service.deleteAllbyId(Arrays.asList(202,203,252));

	}

}
