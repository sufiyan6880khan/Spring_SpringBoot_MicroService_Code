package com.sk.factory;

import com.sk.comp.BlueDart;
import com.sk.comp.DTDC;
import com.sk.comp.Flipkart;
import com.sk.comp.ICourier;

public final class FlipkartFactory 
{
	
	//static factory method having factory pattern logic
	public static Flipkart  getlnstance(String courierType) {
	
	//create Dependent class
	ICourier courier = null;
	
	       if(courierType.equalsIgnoreCase("dtdc"))
	           courier =   new DTDC();
	       
	      else if(courierType.equalsIgnoreCase("bIueDart"))	  
	             courier =   new BlueDart();
	       
	          else
		           throw new	IllegalArgumentException("invalid courier type");
	
	               //create target class
	             Flipkart fpkt    =       new Flipkart(); 
	             
	        //assign dependent class object to target class
	           fpkt.setCourier(courier);
	            return fpkt;

         }
}
