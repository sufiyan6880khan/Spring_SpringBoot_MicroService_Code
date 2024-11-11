package com.sk.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sk.config.AppConfig;
import com.sk.sbeans.SeasionFinder;
import com.sk.config.*;

public class AutowiringTest 
{
	public static void main(String ags[])
	{
	
		AnnotationConfigApplicationContext ctx = 
				             new AnnotationConfigApplicationContext(AppConfig.class);
		
		SeasionFinder find = ctx.getBean("sf",SeasionFinder.class);
		
		 String msg =  find.generateMessage();
		 
		 System.out.println("Current Seasion is :: "+msg );
		 
		 ctx.close();
		
	}

}
