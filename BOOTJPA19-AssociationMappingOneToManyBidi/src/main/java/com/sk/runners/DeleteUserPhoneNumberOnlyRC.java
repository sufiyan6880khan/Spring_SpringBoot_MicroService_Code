package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.service.IUserMgntService;

@Component
@Profile("deleteUserPhoneNumberOnly")
public class DeleteUserPhoneNumberOnlyRC implements CommandLineRunner {

	@Autowired
	private IUserMgntService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			service.deleteUserPhoneNumberOnly();
			
		} catch (Exception e) {
	       e.printStackTrace();
		}

	}

}
