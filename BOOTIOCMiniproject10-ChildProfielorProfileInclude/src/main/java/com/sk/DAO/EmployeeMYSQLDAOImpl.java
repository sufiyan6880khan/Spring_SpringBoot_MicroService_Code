package com.sk.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.sk.Javabean.Employee;
@SuppressWarnings("unused")

@Repository("empMYSQLDAO")
@Profile({"uat", "prod", "pre-prod"})
public class EmployeeMYSQLDAOImpl  implements IEmployeeDAO
{
     // SELECT QUERY
	private static final  String  GET_EMP_QUERY  =  "SELECT EMPNO, ENAME ,  JOB, MGR, SAL, COMM, DEPTNO FROM EMP WHERE JOB IN (?,?,?) ";
		
	// INSERT QUERY
	private static final String INSERT_EMPLOYEE = "INSERT INTO EMP ( ENAME,	 JOB,  MGR,  SAL , COMM, DEPTNO)  VALUES (?,?,?,?,?,?)";
	
	// DELETE QUERY 
	private static final String DELETE_EMPLOYEE = "DELETE FROM EMP WHERE EMPNO = ?";	
	
	      @Autowired 
     private DataSource ds;  
		 

	// SELECT OPERATION
	@Override
	public List<Employee>  getEmployeeByDeg(String desg1, String desg2, String desg3) throws Exception 
	{
		List<Employee> list = null;
		
		System.out.println("Datasource object name ::  "+ds.getClass());
		 
		try( Connection  con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMP_QUERY);)	{
		
			
			// set values to query  params 
			ps.setString(1, desg1); 
			ps.setString(2, desg2);
			ps.setString(3, desg3);
		
			
			// execute the SQL Query	
			try( ResultSet rs = ps.executeQuery() )
			{
			    list  =  new ArrayList<Employee>();   
				while(rs.next()) 
				{
					Employee emp = new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setMgr(rs.getInt(4));
					emp.setBsal(rs.getInt(5));
					emp.setComm(rs.getInt(6));
					emp.setDeptno(rs.getInt(7));
					list.add(emp);
					
				}// end of while loop
				
			}//try2
		
		}//try1
       
		catch (SQLException se) {
                 se.printStackTrace();
                 throw se;
		}// end of catch 
		
		catch (Exception e) {
			   e.printStackTrace();
			   throw e;
		}// end of catch
		return list;

	} // end of getEmployee  method
	
	

//  INSERT OPERATION
	@Override
	public int insertEmployee(Employee emp) throws Exception {
		 
		int result = 0;
		
		   try(  // get polled connection  
				   Connection con = ds.getConnection();
				   // create prepare statement 
				   PreparedStatement ps = con.prepareStatement(INSERT_EMPLOYEE);)
		   {
			       
			          // SET VALUE TO Parameter
			                
			              ps.setString(1, emp.getEname());
			              ps.setString(2, emp.getJob()); 
			              ps.setInt(3, emp.getMgr());
			              ps.setInt(4, emp.getBsal());
			              ps.setInt(5, emp.getComm());
			               ps.setInt(6, emp.getDeptno());
			               // execute the SQL query
			              result =  ps.executeUpdate();
		   } // end of try 
		   catch (SQLException se) { 
			   se.printStackTrace();
			   throw se;
            	} 
		   
		   catch (Exception e) {
		     e.printStackTrace();
		     throw e;
		}
		return result;
	} // end of insertEmployeee method


	// DELETE OPEREATION
	@Override
	public int deleteEmployee(Employee emp) throws Exception
	{
		int result = 0;
          try(// get pooled connection
        		  Connection con = ds.getConnection();
        		  // create prepared statement 
        		  PreparedStatement ps = con.prepareStatement(DELETE_EMPLOYEE); ){
        	  
        	  // set parameter to query
        	  ps.setInt(1, emp.getEmpno());
        	  
        	  result = ps.executeUpdate();
   	         	  
          }catch (SQLException se) {
	           se.printStackTrace();
		         }
          catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
        	  
        	  return result;
         
	}

}// end of class
































