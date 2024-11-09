package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sk.sbeans.Vehicle;

@SpringBootApplication 
public class BootioCproject03LooseCouplingDepenedencyInjectionApplication 
  {
	
	public BootioCproject03LooseCouplingDepenedencyInjectionApplication ()
	{  

		     System.out.println( " BootioCproject03LooseCouplingDepenedencyInjectionApplication  :: 0-arg Constructor ");
		     
	} 
      
	
	public static void main(String[]  args)   
	{
		
	        	System.out.println("BootioCproject03LooseCouplingDepenedencyInjectionApplication.main() :: start");
		       
				ApplicationContext ctx  =   SpringApplication.run(BootioCproject03LooseCouplingDepenedencyInjectionApplication.class, args);
				 
			 	Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
				
			 	vehicle.journey("hyd", "delhi");
			   
	            ((ConfigurableApplicationContext)ctx).close();
	           
	           System.out.println("BootioCproject03LooseCouplingDepenedencyInjectionApplication.main() :: stop");
			
	 } 
  
}
