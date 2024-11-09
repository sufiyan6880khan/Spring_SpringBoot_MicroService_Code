package com.sk.javaBean;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class Hospital implements Serializable
{
	private String hname;
	private Integer hno;
	private String location;
	private Integer totalBed;
	private Integer totalDoc;
	private String htype;
	
}
