package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sk.sbeans.PatientInfo;

@SpringBootApplication
public class BootiocMiniproject06ValueAnnotationSpelApplication 
 {
	public static void main(String[] args) 
	{ 
		// get IOC Container 
	       ApplicationContext ctx =   SpringApplication.run(BootiocMiniproject06ValueAnnotationSpelApplication.class, args);
	
	       PatientInfo details = ctx.getBean("pi",PatientInfo.class);
	       
	       System.out.println(details);

	} 

}
