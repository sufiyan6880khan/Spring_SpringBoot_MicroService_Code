package com.sk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.JobSeeker;
import com.sk.repository.IJobSeekerRepository;

@Service
public class JobSeekerServiceImpl implements IJobSeekerService {

	@Autowired
	private IJobSeekerRepository jobRepo;
	
	@Override
	public String resisterJobSeeker(JobSeeker jobsr) {
        int idVal =   jobRepo.save(jobsr).getJid();
		return "JobSeeker is resister whise id is  : "+idVal;
	}

}
