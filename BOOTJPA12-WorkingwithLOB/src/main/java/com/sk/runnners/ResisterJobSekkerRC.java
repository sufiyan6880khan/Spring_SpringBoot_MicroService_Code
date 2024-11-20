package com.sk.runnners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sk.entity.JobSeeker;
import com.sk.service.IJobSeekerService;
@SuppressWarnings("all")
@Component
public class ResisterJobSekkerRC implements CommandLineRunner {

	@Autowired
	private IJobSeekerService service;
	
	@Override
	public void run(String... args) throws Exception {
	
		try(Scanner s = new Scanner(System.in)){
			
			System.out.println("Enter the name ");
			String name = s.nextLine();
			System.out.println("Enter the Addr");
			String Addr = s.nextLine();
			System.out.println("Enter the photo path ");
			String photoPath = s.nextLine();
			System.out.println("Enter the resume path ");
			String resumePath = s.nextLine();
			System.out.println("Are you indian true or false ");
			Boolean indian  =  s.nextBoolean();
			
			
			// Prepare byte representing photo path 
			InputStream  is = new FileInputStream(photoPath);
			byte[] photoData = new byte[is.available()];
			photoData = is.readAllBytes();
			
			// Prepare char data representing biddata file content
			File file = new File(resumePath);
			Reader reader = new FileReader(file);
			char resumeData[ ]= new char[(int) file.length()];
			reader.read(resumeData);
			
			JobSeeker js = new JobSeeker(name, Addr, photoData, resumeData, indian);
			String msg = service.resisterJobSeeker(js);
			System.out.println(msg);
			
			
		}catch (Exception e) {
		e.printStackTrace();
		
		}
		

	}

}
