package com.sk.sbeans;


import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Component("wkm")
public class WeekMessage 
{
	@Autowired 
private LocalDate ldate;


public String getMessage()
 {
	   DayOfWeek weak = ldate.getDayOfWeek();
	   
              System.out.println(weak);
	   
	   if(weak  == DayOfWeek.SATURDAY || weak  == DayOfWeek.SUNDAY)
	   {
		     return "Enjoy your Weakend  : " + weak ; 
	   }
	      return "Oh oh is Weekday  : " + weak;
 }
	
} 
