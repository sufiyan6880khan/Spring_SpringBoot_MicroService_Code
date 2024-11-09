package com.sk.DAO;

import java.util.List;

import com.sk.Javabean.Employee;

public interface IEmployeeDAO 
{
	
     public List<Employee> getEmployeeByDeg(String desg1, String desg2, String desg3) throws  Exception ;
     
     public int insertEmployee(Employee emp) throws Exception;
     
     public int deleteEmployee(Employee emp) throws Exception;
     
     
     public int updateEmployee(Employee emp) throws Exception;
     
}

