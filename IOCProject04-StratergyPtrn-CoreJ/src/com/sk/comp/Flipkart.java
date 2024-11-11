package com.sk.comp;

import java.util.Arrays;
import java.util.Random;

public final  class Flipkart 
{
	
	//HAS-A property
	private ICourier courier;
	
	
	    public void setCourier(ICourier courier)
	      {
	    	
	          System.out.println("Flipkart.setCourier()");
	         this.courier=courier;
	    }
	    
	    
	 // b.method
	    public String shopping(String items[], double prices[])
	    {
	    //calculate bill amount
	    double billAmount=0.0;
	    for(double p: prices)
	    {
	    billAmount=billAmount+p;
	    
        }  
	 // generate the order id (random number as the order)
	    int   oid    =      new Random().nextInt(10000);
	    // deliver the products using courier
	    String msg=courier.deliver(oid);
	    
	    return Arrays.toString(items)+" items with billAmount:::"+billAmount+"-------"+msg;
	  
	    }
}