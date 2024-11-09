package com.sk.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenrator
{
	@Autowired
	private LocalDateTime ldate;
	
	public String getMessge( String name)
	{
		int time = ldate.getHour();
		
		if (time >=6 && time <12) 
		{
		     return "Good Morning "+name;
		}
		else if (time >=17 && time <21) 
		{ 
			 return "Good Evenning "+name;
		}
		 return "Good Night "+name;
	
	}

}
