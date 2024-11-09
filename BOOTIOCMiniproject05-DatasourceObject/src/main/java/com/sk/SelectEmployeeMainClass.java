package com.sk;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.sk.Controller.OperationController;
import com.sk.Javabean.Employee;

@SpringBootApplication
@ImportResource("com/sk/cfgs/applicationContext.xml")
public class SelectEmployeeMainClass 
{
 
	public static void main(String[] args) 
	{
		// get IOC container
	ApplicationContext  ctx = SpringApplication.run(SelectEmployeeMainClass.class, args); 
		
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
		
		// close the container
       ((ConfigurableApplicationContext)ctx).close();
		
	}
}
   