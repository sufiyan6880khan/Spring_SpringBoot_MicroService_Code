package com.sk.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("vhcl")
  public class Vehicle 
  {
	
                    @Autowired
                    @Qualifier("dEngine")
	                private IEngine engine;

         public Vehicle() {};
          
          public String getVehicle(String  startLoc, String stopLoc )
          {
        	  // Start the engine and begin the journey
              engine.startEngine();
              engine.journeyStart();
              
              System.out.println("Vehicle starting journey from " + startLoc + " to " + stopLoc);

              // Simulate the journey and stop the vehicle
              engine.stopEngine();
              engine.journeyStop();
           

              // Return a success message after the journey ends
              return "Journey completed from " + startLoc + " to " + stopLoc;	  
        
        	  
          }

}
