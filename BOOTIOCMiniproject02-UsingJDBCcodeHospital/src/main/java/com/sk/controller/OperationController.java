package com.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sk.javaBean.Hospital;
import com.sk.service.IHospitalService;

@Controller("hController")
public class OperationController {
	
	@Autowired
	private IHospitalService service;

	public List<Hospital>  showAllHospitalByLoc(String loc1, String loc2) throws Exception
	{
		 
		List<Hospital> list = service.processHospitalDetails(loc1, loc2);
		
		return list;
		 
	}
	      
	//  INSERT OPERATION
	public String processHospital(Hospital hs ) throws Exception{
		
		String insertMsg = service.registerHospital(hs);
		
		return insertMsg;
		
	}

}
