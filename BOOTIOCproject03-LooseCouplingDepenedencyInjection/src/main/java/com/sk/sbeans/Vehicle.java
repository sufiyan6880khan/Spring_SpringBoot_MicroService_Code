package com.sk.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle
{
	@Autowired
	@Qualifier("dEngine")
    private IEngine engine;
	
	public Vehicle() {
		System.out.println("Vehicle:: 0-param Constructor");
	}
	
	public void  journey(String startPace,  String stopPlace)
	{
		
		engine.start();
		System.out.println(startPace +" to "+stopPlace +" journey Started...");
		
		engine.stop();
		System.out.println(startPace +" to "+stopPlace +" journey Stopped...");
		
	}
	
	
	
}
