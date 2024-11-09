package com.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sk.dao.IHospitalDAO;
import com.sk.javaBean.Hospital;

@Service("hService")
public class HospitalServiceimpl implements IHospitalService {
 
	@Autowired
	private IHospitalDAO dao;
	
@Override
	public List<Hospital> processHospitalDetails(String loc1, String loc2) throws Exception 
	{ 
  
	
      List<Hospital> 	list = dao.getHospitaByLoc(loc1.toUpperCase(), loc2.toUpperCase());
      
		return list;
	}

@Override
public String registerHospital(Hospital hs) throws Exception {
	
	int result = dao.insertHospitalByHno(hs);
	if(result == 0) {
		return "Hospital is not resistered......try again...... ";
	}
	
	return "Hospital is  resistered successfullyy........";
}

}
