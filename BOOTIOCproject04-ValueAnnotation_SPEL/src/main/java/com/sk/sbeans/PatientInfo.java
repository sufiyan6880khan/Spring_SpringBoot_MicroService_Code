package com.sk.sbeans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pi")
@Data
public class PatientInfo {
	
	@Value("1001")
	private Integer Pid;
	
	@Value("${pat.name}")
	private String  PName;
	
	@Value("${pat.addr}")
	private String Paddr;
	
	@Value ("${pat.email}")
	private  String Pemail;
	
	@Value("#{dc.xrayPrice + dc.mriPrice + dc.ctscanPrice}")
	private  Float totalBill;
	
	
}
