package com.sk.Javabean;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings({ "unused", "serial" })


@Data
public class Employee implements Serializable
{

      	  private Integer empno;
	      private String ename;
	      private String job;
	      private Integer mgr; 
	      private Integer bsal; 
	      private Integer comm;
	      private  Integer deptno;
	      private Float da;
	      private Float pf;
	      private Float totalSal;
	      

}
