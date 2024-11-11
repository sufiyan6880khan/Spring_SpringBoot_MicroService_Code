package com.sk.sbeans;
import org.springframework.stereotype.Component;
@Component("dEngine")
public class DesielEngine  implements IEngine
{

	@Override
	public void startEngine() {
		System.out.println("Diesel Engine Started.....");
		
	}

	@Override 
	public void journeyStart() {
		System.out.println("Journey  Started.....");
		
	}
	@Override
	public void journeyStop() {

		System.out.println("Diesel Engine Stop....");
	}
	
	@Override
	public void stopEngine() 
	{
		System.out.println("Journey Stoped.....");
		
	}
	
}
