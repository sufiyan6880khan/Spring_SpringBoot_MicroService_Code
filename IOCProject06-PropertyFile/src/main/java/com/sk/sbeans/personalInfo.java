package com.sk.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value = "com/sk/common/Info.properties")
public class personalInfo 
{
	@Value("${per.id}")
    private int id;
    @Value("${per.name}")
    private String name;
    @Value("hyd")
    private String addr;
    
    public void getDetails()
    {
    	System.out.println("id  :"+id);
    	System.out.println("name  :"+name);
    	System.out.println("address  :"+addr);
    	
    }

}
