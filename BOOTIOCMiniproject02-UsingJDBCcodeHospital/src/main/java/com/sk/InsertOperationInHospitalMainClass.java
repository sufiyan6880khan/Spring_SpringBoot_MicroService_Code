package com.sk;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sk.controller.OperationController;
import com.sk.javaBean.Hospital;

@SuppressWarnings("resource")
@SpringBootApplication
public class InsertOperationInHospitalMainClass {

	public static void main(String[] args) 
	{
		
		// get IOC Container
		ApplicationContext ctx  =   SpringApplication.run(InsertOperationInHospitalMainClass.class, args);
		
		
		// get Controller class obj ref
		OperationController controller =  ctx.getBean("hController", OperationController.class);
		
		
		// create obj for Scannner class
		Scanner s = new Scanner(System.in);
		// read location  input from user 
		System.out.println("Enter the hospital name");
		String hanme = s.nextLine();		
		System.out.println("Enter the hospital no..");
		int hno = Integer.parseInt(s.nextLine());
		System.out.println("Enter the hospital Location");
		String hloc= s.nextLine();		
		System.out.println("Enter the Total Bed quantity in Hospital");
		int totalbed = Integer.parseInt(s.nextLine());
		System.out.println("Enter the Total number of Doctor in Hospital");
		int totaldoc = Integer.parseInt(s.nextLine());
		System.out.println("Enter the hospital type (GOVERNMENT (OR) PRIVATE)");
		String htype = s.nextLine();	
	
		try {
			// create obj for hospital
			Hospital hs = new Hospital();
			
			
			// set value in hospital obj
			hs.setHname(hanme);
			hs.setHno(hno);
			hs.setHtype(htype);
			hs.setLocation(hloc);
			hs.setTotalBed(totalbed);
			hs.setTotalDoc(totaldoc);
			
			
			// invoke the b.method 
			String msg = controller.processHospital(hs);
			System.out.println(msg);

		}catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Some internal Problem please try again..........");
		}
		
		s.close();
		
		}

}
