package com.sk.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pEngine")
@Lazy(true)
public class PetrolEngine  implements IEngine 
{

	public PetrolEngine() {
		System.out.println("PetrolEngine:: 0-param Constructor");
	}

	@Override
	public void start() {
		System.out.println(" Petrol  Engine started.....");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine stopped.... ");
		
	}
	
	
}
