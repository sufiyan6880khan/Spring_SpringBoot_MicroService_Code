package com.sk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;
import com.sk.sbeans.VoterDetails;

public class SpringBeanLifeCycleTest 
{

	public static void main(String[] args) {
		//create  the IOC container
		AnnotationConfigApplicationContext ctx=
				 new AnnotationConfigApplicationContext(AppConfig.class);
		//get Springbean class obj ref
		VoterDetails  details=ctx.getBean("vd",VoterDetails.class);
		//invoke the b.method
		String resultMsg=details.checkVotingElgbility();
		System.out.println(resultMsg);
		
		//close the container
		ctx.close();
	}

}
