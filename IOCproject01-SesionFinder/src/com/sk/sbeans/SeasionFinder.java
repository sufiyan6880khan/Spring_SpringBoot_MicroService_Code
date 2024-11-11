package com.sk.sbeans;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasionFinder {
	@Autowired
	private LocalDate ld ;
	public  String 	generateMessage ()
	{
		int  month  = ld.getMonthValue();
		System.out.println("Current month : " +month  );
   if(month >=3 && month <=6)
   {
	   return "Summer seasion";
   }
   else if(month>=7 && month <=10)
   {
	   return "Rainy seasion";
   }
   else
		return " Winter Seasion";
	}
}
