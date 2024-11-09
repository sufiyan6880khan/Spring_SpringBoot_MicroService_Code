package com.sk.dao;

import java.util.List;

import com.sk.javaBean.Hospital;

public interface IHospitalDAO 
{
	
	public List<Hospital> getHospitaByLoc(String loc1, String loc2) throws Exception;
	
	public int  insertHospitalByHno(Hospital hs) throws Exception;
	

}
