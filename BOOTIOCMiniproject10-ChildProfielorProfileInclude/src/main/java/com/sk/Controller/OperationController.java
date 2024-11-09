package com.sk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sk.Javabean.Employee;
import com.sk.Service.IEmployeeService;

@Controller("oController")
public class OperationController 
{ 
	@Autowired
	private IEmployeeService service;
	
	// Select emp 
	public List<Employee> showAllEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
	
	           List<Employee> list = service .fetchIEmployeeByDesgs(desg1, desg2, desg3);
	            
			return list;

	}// end of showAllEmployeByDesgs method
	 
	//  insert employee 
	public String processEmployee(Employee emp) throws Exception 
	{
		String msg = service.resgisterEmployee(emp);
		
		return msg;
	} // end of processEmployee method  
	 
	public String deletingEmployee(Employee emp) throws Exception
	{
		String deleteMsg =  service.deleteEmployee(emp);
		return deleteMsg;
	} // end of deletingEmployee method 
	
	
	
	
}// end of class  class
