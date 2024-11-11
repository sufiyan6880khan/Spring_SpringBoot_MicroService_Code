package com.sk.factory;

import com.sk.comps.*;


public class CarFactory 
{
	
	public static ICar getInsTance(String carType)
	{
		ICar car = null;
		if(carType.equalsIgnoreCase("luxury"))
			car = new LuxuryCar();
		else if(carType.equalsIgnoreCase("sport"))
			car = new SportCar();
		else if(carType.equalsIgnoreCase("standardrs"))
			car = new StandarsCar();
		else
			throw  new IllegalArgumentException("Invalid Argument Type...");
		
			car.assemble();
			car.testDrive();
			car.diliver();
		
		return car;
		
	}

}
