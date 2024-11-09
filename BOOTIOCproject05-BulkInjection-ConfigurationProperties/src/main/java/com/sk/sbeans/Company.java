package com.sk.sbeans;

import java.util.List;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("comp")
@ConfigurationProperties(prefix = "com.sk")
public class Company 
{
	
	private Integer id;
	private String cname;
	private String  branch;
	private Long pincode;
	private Integer size;
	private Long phoneno;

	private String[] addr; 
	private Set<Integer> pincodes;
	private List<String> cnames;
	

}
