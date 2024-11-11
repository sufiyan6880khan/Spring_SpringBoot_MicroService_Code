package com.sk.main;
import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;

public class SpringI18nTest {


	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext  ctx=
				  new  AnnotationConfigApplicationContext(AppConfig.class);
		//gather Locale  details from  end user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Language code ::");
		String lang=sc.next(); 
		System.out.println("Enter Country code ::");
		String country=sc.next();
		//prepare Locale object data
		Locale locale = new Locale (lang,country);
		//get the messages from  the Locale specific properties file
		String msg1=ctx.getMessage("nit.welcome",new String[] {"raja"},locale);
		String msg2=ctx.getMessage("nit.bye",new String[] {},locale);
		String msg3=ctx.getMessage("nit.wishes",new String[] {},locale);
		
		//print the message
		System.out.println(msg1+"   "+msg2+"   "+msg3);
		
		//close the container
		ctx.close();
	} 

}
