package com.sk.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dc")
@Data
public class DiagonosticCatalog {
	
	@Value("${catalog.xray}")
	private Float xrayPrice;
	
	@Value("${catalog._2dxray}")
	private Float _2dPrice;
	
	@Value("${catalog._3dxray}")
	private Float _3dPrice;
	
	@Value("${catalog.ctsacan}")
	private Float ctscanPrice;
	
	@Value("${catalog.mri}")
	private Float mriPrice;

}
