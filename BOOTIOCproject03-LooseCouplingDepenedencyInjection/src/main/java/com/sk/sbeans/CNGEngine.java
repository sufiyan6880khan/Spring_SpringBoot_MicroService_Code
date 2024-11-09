package com.sk.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cEngine")
@Lazy(true)
public class CNGEngine implements IEngine
{
       public CNGEngine()
       {
    	   System.out.println("CNGEngine:: 0-param Constructor");
   	  }
       
	@Override
	public void start() {
		System.out.println("CNG Engine started.....");
	}

	@Override
	public void stop() {
		System.out.println("CNG Engine stopped.... ");
		
	}

}
