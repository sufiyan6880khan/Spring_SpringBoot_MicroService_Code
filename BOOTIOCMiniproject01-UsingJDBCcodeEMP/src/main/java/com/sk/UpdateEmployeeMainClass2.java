package com.sk;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
 
import com.sk.Controller.OperationController;
import com.sk.Javabean.Employee;

@SpringBootApplication
public class UpdateEmployeeMainClass2 
{
 
	public static void main(String[] args) 
	{
		// get IOC container
	ApplicationContext  ctx = SpringApplication.run(UpdateEmployeeMainClass2.class, args); 
	
	// get Controller class Object reference 
	OperationController controller = ctx.getBean("oController",OperationController.class);
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Employee-no...");
	Integer empno = Integer.parseInt(s.nextLine());
	System.out.println("Enter the Employe- SALARY");
	int sal =s.nextInt(); 
	System.out.println("Enter the Employe- Commision");
	int comm =s.nextInt(); 
       try{
    	    
    	   Employee emp =new Employee();
    	   emp.setEmpno(empno);
    	   emp.setBsal(sal);
    	   emp.setComm(comm);
    	   
    	   
    	   String msg = controller.updateEmployee(emp);
    	   System.out.println(msg);
       }

       catch (Exception e) 
       {
    	   e.printStackTrace();
	        
	  } // end of catch
		
		// close the container
  	     s.close();
       ((ConfigurableApplicationContext)ctx).close();
		
	}
}
   