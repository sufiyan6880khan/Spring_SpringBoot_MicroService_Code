package com.sk.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator
{
	
	 
	@Scheduled (cron = "15-30 * * * * *")
	public void generateSalesReport()
	{
		System.out.println("Sales Report on :"+ new Date());
	}

}
