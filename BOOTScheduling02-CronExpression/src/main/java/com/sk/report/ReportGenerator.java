package com.sk.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator
{
	
	 //@Scheduled(initialDelay  = 2000  , fixedDelay = 3000)
	 //@Scheduled(initialDelay  = 2000  )
    //	@Scheduled( fixedDelay = 3000)
   //	@Scheduled (initialDelay = 10000, fixedRate = 4000)
  //	@Scheduled (initialDelay = 4000, fixedDelay = 6000)
	@Scheduled (initialDelay = 4000, fixedRate = 15000)
	public void generateSalesReport()
	{
		System.out.println("Sales Report on :"+ new Date());
	}

}
