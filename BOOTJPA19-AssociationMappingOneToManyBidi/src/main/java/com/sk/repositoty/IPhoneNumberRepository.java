package com.sk.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.PhoneNumber;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> 
{
	

}
