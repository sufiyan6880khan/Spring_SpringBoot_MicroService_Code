package com.sk.Service;
import java.util.List;

import com.sk.Javabean.Employee;

public interface IEmployeeService 
{

	public List<Employee> fetchIEmployeeByDesgs(String desg1, String desg2,String desg3) throws Exception ;
	
	public String resgisterEmployee(Employee emp) throws Exception;
	
	public String deleteEmployee(Employee emp) throws Exception;
	
	public String updateEmployee(Employee emp) throws Exception;
}
