package com.sk;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.sk.Controller.OperationController;
import com.sk.Javabean.Employee;

@SpringBootApplication
public class SelectMainClass 
{
 
	
	
	
	public static void main(String[] args) 
	{
		// get IOC container
	ApplicationContext  ctx = SpringApplication.run(SelectMainClass.class, args); 
		
	
	// get Controller class Object reference d1
	OperationController controller = ctx.getBean("oController",OperationController.class);
	
       try{
    	      	   // invoke the b.method
    	   List<Employee> list = controller.showAllEmployeeByDesgs("MANAGER", "SALESMAN", "CLERK");
    	   
    	  list.forEach(k->{
    		         System.out.println(k.toString()); 
    	  } );
  
       }  // end of try  
       catch (Exception e) 
       {
    	   
    	   e.printStackTrace(); 
	        
	  } // end of catch
       
       Environment env = ctx.getEnvironment();
       System.out.println("Active Profile is :: "+ Arrays.toString(env.getActiveProfiles()));
		
		// close the container
       ((ConfigurableApplicationContext)ctx).close();
		
	}
}
   