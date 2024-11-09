package com.sk;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.sk.Controller.OperationController;
import com.sk.Javabean.Employee;

@SpringBootApplication
public class InsertEmployeeMainClass 
{
 
	public static void main(String[] args) 
	{
		// get IOC container
	ApplicationContext  ctx = SpringApplication.run(InsertEmployeeMainClass.class, args); 
	
	// get Controller class Object reference 
	OperationController controller = ctx.getBean("oController",OperationController.class);
	
	

    Environment env = ctx.getEnvironment();
    System.out.println("Active Profile is :: "+ Arrays.toString(env.getActiveProfiles()));
    Scanner s = new Scanner(System.in);
    
    
    try {
	System.out.println("Enter the Employe- Name");
	String ename = s.nextLine();
	System.out.println("Enter the Employe- JOB");
	String job = s.nextLine();
	System.out.println("Enter the Employe- Manager id must be (7566, 7698, 7782, 7839,7902,7788)");
	int mgr =s.nextInt(); 
	System.out.println("Enter the Employe- SALARY");
	int sal =s.nextInt(); 
	System.out.println("Enter the Employe- Commision");
	int comm =s.nextInt(); 
	System.out.println("Enter the Employe- DEPTNO..(10..20..30..40...)");
	int deptno = s.nextInt();	
	 s.close();
  
	 
       try{
    	    
    	   Employee emp =new Employee();
    	   emp.setEname(ename);
    	   emp.setJob(job);
    	   emp.setBsal(sal);
    	   emp.setDeptno(deptno);
    	   emp.setComm(comm);
    	   emp.setMgr(mgr);
    	   
    	   
    	   String msg = controller.processEmployee(emp);
    	   System.out.println(msg);
       }
      
    	    
       catch (Exception e) 
       {
    	   e.printStackTrace();
	        
	  } // end of catch
    }catch (Exception e) {
	    System.out.println("try again.....Please give valid input... ");
	}
       
		// close the container
       ((ConfigurableApplicationContext)ctx).close();
		
	}
}
   