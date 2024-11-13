package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.BankAccount;

public interface IBankAccountRepo extends JpaRepository<BankAccount, Long> {

}
