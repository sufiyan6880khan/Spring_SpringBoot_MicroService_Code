package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.service.IPersonalInfoService;

@Component
@Profile("showAllPersionalInfo")
public class showAllPersionalInfoRC implements CommandLineRunner {

	@Autowired
	private IPersonalInfoService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		service.showAllPersionalInfo().forEach(System.out::println);
	
	}

}
