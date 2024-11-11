package com.sk.test;

import com.sk.comp.Flipkart;
import com.sk.factory.*;

public class StratergyDPtest
{
	  public static void main(String[] args) {
		
		  
		// use Factory Pattern to target class
	    	  Flipkart fpkt = FlipkartFactory.getlnstance("dtdc");
		  
		  //invoke the b.method
	      	  String resultMsg=fpkt.shopping(new String[] {"shirt","jeans"},  new double[] {5000.0,6000.0});
	      	  System.out.println(resultMsg);
		  
	}

}
