package com.sk.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sk.DAO.IEmployeeDAO;
import com.sk.Javabean.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService
{
	
@Autowired
@Qualifier("empMYSQLDAO")
	private IEmployeeDAO dao;
	
// SELECT OPERATION 
	@Override
	public List<Employee> fetchIEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception 
	{

		// use dao
		List<Employee> list = dao.getEmployeeByDeg(desg1, desg2, desg3);
	  
	   
		list.forEach((k)->
		{
		        Integer bSal = k.getBsal();
				Float da = (float) (bSal * 0.2);
				Float pf = (float)(bSal * 0.1);
				Float totalSal = (float)(bSal + pf + da);
			 
				k.setDa(da); 
				k.setPf(pf);
		        k.setTotalSal(totalSal);
		       
		});

		return list;
	} // end of fetchEmployeee  method 
	

	
	// UPDATE OPERATION
	@Override
	public String resgisterEmployee(Employee emp) throws Exception
	{
		  int result = dao.insertEmployee(emp);
		  
		  if (result == 1)
		  {
			  return "Employee resister successfully........";		 
			  }

		return "Employee not resister.......";
	} // end of resisterEmployee method 

	
	
	//  DELETE OPERATION
	@Override
	public String deleteEmployee(Employee emp) throws Exception {
		
		int result = dao.deleteEmployee(emp);
		
		if(result == 1) {
			return "Employee details delete successfully";
		}
		return "Employee details not available please give valid employee no..";
	}  /// end of deleteEMPLOYEE METHOD


	// UPDATE OPERATION
	@Override
	public String updateEmployee(Employee emp) throws Exception {
		
		 int result = dao.updateEmployee(emp);
		  
		  if (result == 1)
		  {
			  return "Employee UPDATE successfully........";		 
			  } 

		return "Employee data not available please provide valid empno.... ";
		
		
	}
	
	
} // class
