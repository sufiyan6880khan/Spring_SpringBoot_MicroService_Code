package com.sk.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;
import com.sk.sbeans.Vehicle;

public class StatergyDPtest
{
     public static void main(String[] args) {

    		AnnotationConfigApplicationContext ctx =
    				              new AnnotationConfigApplicationContext(AppConfig.class);
    		
    		 // Get the Vehicle bean
    	    Vehicle vehicle = ctx.getBean("vhcl",Vehicle.class);
    	    
    	    // Invoke getVehicle method and print the result
    	    String journeyDetails = vehicle.getVehicle("Delhi", "Hyderabad");
    	    
    	    System.out.println(journeyDetails);
    	   
	}
} 
