package com.sk.main;

import com.sk.comps.ICar;
import com.sk.factory.CarFactory;

public class Customer1 
{
public static void main(String[] args) 
{
	
	ICar car = CarFactory.getInsTance("Luxury");
	car.drive();
}

}
