package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.BankAccount;
import com.sk.service.IBankAccountMngmt;

@Component
@Profile("openBankAccount")
public class OpenBankAccountRC implements CommandLineRunner {

	@Autowired
	private IBankAccountMngmt service;
	
	@Override
	public void run(String... args) throws Exception {
		BankAccount ba = new BankAccount("Smith", 238000D);
		try {
	              String msg =	service.openBankAccount(ba);
	              System.out.println(msg);
		
		}catch (Exception e) {
		e.printStackTrace();
	}

	}
}
