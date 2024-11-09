package com.sk.service;

import java.util.List;

import com.sk.javaBean.Hospital;

public interface IHospitalService 
{
	
	public List<Hospital> processHospitalDetails(String loc1, String loc2 ) throws Exception;
	
	public String registerHospital(Hospital hs) throws Exception;

}
