package com.sk.runners;

import java.util.Optional;

import org.aspectj.weaver.bcel.BcelAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sk.entity.BankAccount;
import com.sk.service.IBankAccountMngmt;

@Component
@Profile("getAllDetailsAboutAccount")
public class GetAllDetailsAboutAccount implements CommandLineRunner {
	
   @Autowired
	private IBankAccountMngmt service;

	@Override
	public void run(String... args) throws Exception {
		
		Optional<BankAccount> opt = service.getDetailsOfAccount(900000041);
		if (opt.isPresent()) {
			BankAccount account = opt.get();
			System.out.println("\tAccount is modified  "+ account.getModificationCount()+" times"
					+ "\n\t Account is Opened on : "+account.getOpeningDate()
					 +"\n\t Account Lastly operate on :  "+account.getLastlyOperatedOn()
					 +"\n\t Account balace is :"+account.getBalance()
					 +"\n\t Account holder name : "+account.getHolderName());
		} else {
			System.out.println("BankAccount Details not found....");

		}
		
	}

}
