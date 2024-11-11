package com.sk.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine
{
	@Override
	public void startEngine() {
		System.out.println("Petroll Engine Started.....");
		
	}


	@Override
	public void journeyStart() {
		System.out.println("Journey  Started.....");
		
	}

	@Override
	public void journeyStop() {

		System.out.println("Petrol Engine Stop....");
	}
	
	@Override
	public void stopEngine() 
	{
		System.out.println("Journey Stoped.....");
		
	}

}
