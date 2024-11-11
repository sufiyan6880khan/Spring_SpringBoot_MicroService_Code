package com.sk.sbeans;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component("wf")
public class WeakFinder 
{
	@Autowired
	private LocalDateTime ltime;
	
	@SuppressWarnings("rawtypes")
	public  Enum 	generateMessage ()
	{
	
	Enum  weak = ltime.getDayOfWeek();
//	System.out.println(weak);
	return weak;

	}
	
	
}
