package com.sk.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dEngine")
@Lazy(true)
public class DieselEngine implements IEngine
{
	public DieselEngine() {
		System.out.println("DieselEngine:: 0-param Constructor");
	}
	@Override
	public void start()
	{
		System.out.println("Diesel Engine started.....");
	}

	@Override
	public void stop()
	{
		System.out.println("Diesel Engine stopped.... ");

	}
       
}
