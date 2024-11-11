package com.sk.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.confg.AppConfig;
import com.sk.sbeans.personalInfo;

public class PropertieFileTest
{
            public static void main(String[] args) {
				AnnotationConfigApplicationContext  ctx =
						                            new AnnotationConfigApplicationContext(AppConfig.class);
				
            	 personalInfo  inform  =  ctx.getBean("pInfo",personalInfo.class);
            	 
            	 inform.getDetails();
            	
			}
	       
	
}

