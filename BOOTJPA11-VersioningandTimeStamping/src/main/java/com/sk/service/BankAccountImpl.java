package com.sk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.BankAccount;
import com.sk.repository.IBankAccountRepo;

@SuppressWarnings("all")
@Service("bankService")
public class BankAccountImpl implements IBankAccountMngmt {

	@Autowired
	private IBankAccountRepo accountRepo;
	
	@Override
	public String openBankAccount(BankAccount account) {
		long idVal = accountRepo.save(account).getAccNo();
		
		return "Bank Account with account number :: "+idVal;
	}

	@Override
	public String withrawMoney(long acc, double amt) {
	     
		Optional<BankAccount> opt = accountRepo.findById(acc);
		BankAccount account = opt.get();
		if(account != null)
		{
			 account.setBalance(account.getBalance() - amt);
			 accountRepo.save(account);
			 return "Money withdraw Successfully";
		}
		return "Account not found";
	}

	@Override
	public Optional<BankAccount> getDetailsOfAccount(long accNo) {
		return accountRepo.findById(accNo);
	}
	
	
}
