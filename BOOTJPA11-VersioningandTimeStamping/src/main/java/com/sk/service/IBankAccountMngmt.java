package com.sk.service;

import java.util.Optional;

import com.sk.entity.BankAccount;

public interface IBankAccountMngmt {
	
	public String openBankAccount(BankAccount aaccount);
	
	public String withrawMoney(long acc, double amt);
	
	public Optional<BankAccount> getDetailsOfAccount(long accNo);

}
