package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.service.IBankAccountMngmt;

@Component
@Profile("withdrawMoney")
public class WithdrawMoneyRC implements CommandLineRunner {
	
	@Autowired
	private IBankAccountMngmt service;

	@Override
	public void run(String... args) throws Exception {
	
	try {
		
		String msg = service.withrawMoney(900000041 , 2000);
		System.out.println(msg);
		
	} catch (Exception e) {
	e.printStackTrace();
	}

	}

}
