package com.sk;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sk.controller.OperationController;
import com.sk.javaBean.Hospital;


@SpringBootApplication
public class SelectOperationInHospitalMainClass {

	public static void main(String[] args) {
		  
		// get IOC Container
		ApplicationContext ctx  =   SpringApplication.run(SelectOperationInHospitalMainClass.class, args);
		
		// get Controller class object ref
		OperationController controller =  ctx.getBean("hController", OperationController.class);
		
		// create object for Scanner class
//		Scanner s = new Scanner(System.in);
//		// read location  input from user 
//		System.out.println("Enter the 1st hospital location name");
//		String loc1 = s.nextLine();		
//		System.out.println("Enter the 2nd hospital location name");
//		String loc2 = s.nextLine();	
//	
		try { 
			
		// invoke the b.method 
		List<Hospital> list = controller.showAllHospitalByLoc("delhi", "noida");

          list.forEach(k->{
        	  System.out.println(k);
          });
          
		}catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Some internal Problem try again..........");
		}
		 
	
		
		}

}
