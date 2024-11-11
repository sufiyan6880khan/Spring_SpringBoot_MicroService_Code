package com.sk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.sk.sbeans")
@ImportResource("com/sk/cfgs/applicationContext.xml")
public class AppConfig 
{
	

}
  