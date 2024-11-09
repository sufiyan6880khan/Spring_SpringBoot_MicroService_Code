package com.sk;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sk.Controller.OperationController;
import com.sk.Javabean.Employee;

@SpringBootApplication
public class DeleteEmployeeMainClass2 
{
 
	public static void main(String[] args) 
	{
		// get IOC container
	ApplicationContext  ctx = SpringApplication.run(DeleteEmployeeMainClass2.class, args); 
	
	// get Controller class Object reference 
	OperationController controller = ctx.getBean("oController",OperationController.class);
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Employe- No..");
	int empno = s.nextInt();	
	s.close();
       try{
    	    
    	   Employee emp =new Employee();
          emp.setEmpno(empno);
    
    	   String deleteMsg = controller.deletingEmployee(emp);
    	   System.out.println(deleteMsg);
       }
    	    
       catch (Exception e) 
       {
    	   e.printStackTrace();
	        
	  } // end of catch
		
		// close the container
       ((ConfigurableApplicationContext)ctx).close();
		
	}
}
   