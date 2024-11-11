package com.sk.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine
{
	@Override
	public void startEngine() {
		System.out.println("Electric Engine Started.....");
		
	}
	@Override
	public void journeyStart() {
		System.out.println("Journey  Started.....");
		
	}

	@Override
	public void journeyStop() {

		System.out.println("Electric Engine Stop....");
	}
	
	@Override
	public void stopEngine() 
	{
		System.out.println("Journey Stoped.....");
		
	}
}
