package com.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.PersionalInfo;
import com.sk.repository.IPersinalInfoRepository;

@Service
public class PersionalInfoMngmtService implements IPersonalInfoService {

	@Autowired
  private IPersinalInfoRepository pRepo; 
	
	@Override
	public String resisterPersionalInfo(PersionalInfo pInfo) 
	{
		int idval =pRepo.save(pInfo).getPId();
			return " Persinall details save with the id value : "+idval; 
	}

	
	@Override
	public List<PersionalInfo> showAllPersionalInfo() {

		return pRepo.findAll();
	}
	
}
