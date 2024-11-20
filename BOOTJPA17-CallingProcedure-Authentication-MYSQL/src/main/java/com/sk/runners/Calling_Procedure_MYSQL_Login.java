package com.sk.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sk.service.ILoginMgmtService;

@Component
public class Calling_Procedure_MYSQL_Login implements CommandLineRunner {

	@Autowired
	private ILoginMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			  
			
			String msg = service.doLogin("raja1", "rani1");
			System.out.println(msg); 
			 
			 
		} catch (Exception e) {
		   e.printStackTrace();
		}
		

	}

}
