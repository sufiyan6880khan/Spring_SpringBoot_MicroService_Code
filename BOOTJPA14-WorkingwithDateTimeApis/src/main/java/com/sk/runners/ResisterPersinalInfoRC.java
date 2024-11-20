package com.sk.runners;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.PersionalInfo;
import com.sk.service.IPersonalInfoService;

@Component
@Profile("resisterPersinalInfo")
public class ResisterPersinalInfoRC implements CommandLineRunner {

	@Autowired
	private IPersonalInfoService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		PersionalInfo pi = new PersionalInfo( "Alex","Noida", LocalDate.of(2033, 1, 1), LocalTime.of(12, 59, 59), LocalDate.of(2024, 12, 31));
		String msg = service.resisterPersionalInfo(pi);
		System.out.println(msg);
		

	}

}
