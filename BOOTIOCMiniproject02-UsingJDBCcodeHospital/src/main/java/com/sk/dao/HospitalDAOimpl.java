package com.sk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sk.javaBean.Hospital;

@Repository("daoHospital")
public class HospitalDAOimpl implements IHospitalDAO
{
	
	private String GET_HOSP_BY_LOC  =  "SELECT HNAME, HNO, HLOC, TOTAL_BED, TOTAL_DOC, H_TYPE  FROM HOSPITAL WHERE HLOC IN (?,?)";
	
	// INSET QUERY
	private String  INSERT_HOSP_DETAILS = " INSERT INTO HOSPITAL (HNAME,  HNO,   HLOC,   TOTAL_BED,   TOTAL_DOC,   H_TYPE) VALUES(?,?,?,?,?,?)";

	@Autowired
	private DataSource ds;

	@Override
	public List<Hospital> getHospitaByLoc(String loc1, String loc2) throws Exception 
	{
		
		 List<Hospital> list   = null;
		
		try(// get pooled connection  
                  Connection con = ds.getConnection();
				  // create prepared statement 
				  PreparedStatement ps = con.prepareStatement(GET_HOSP_BY_LOC);	){
			
			// Set value to parameter 
			ps.setString(1, loc1);
			ps.setString(2, loc2);
		    Hospital hs = new Hospital();
			// execute query
			try(ResultSet rs = ps.executeQuery()){
				
				list = new ArrayList<Hospital>();
				
     
				while(rs.next()) {
			
					hs.setHname(rs.getString(1));
					hs.setHno(rs.getInt(2));
					hs.setLocation(rs.getString(3));
					hs.setTotalBed(rs.getInt(4));
					hs.setTotalDoc(rs.getInt(5));
					hs.setHtype(rs.getString(6));	
					list.add(hs);
					
				} // end of while loop
				
			} // end of try 2
	
		} // end of try 1
		catch (SQLException se) {
			   se.printStackTrace();
			   throw se;
			} // end of catch 1
		
		catch (Exception e) {
			  e.printStackTrace();
			  throw e;
		}
	
		return list;
	}

	@Override
	public int insertHospitalByHno(Hospital hs) throws Exception {
		
		int result = 0;
		
		try( // get pooled connection
				Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(INSERT_HOSP_DETAILS);){
			
			// set value to query parameter 
	    	  ps.setString(1,hs.getHname());
	    	  ps.setInt(2,hs.getHno());
	    	  ps.setString(3, hs.getLocation());
	    	  ps.setInt(4, hs.getTotalBed());
	    	  ps.setInt(5, hs.getTotalDoc());
	    	  ps.setString(6,hs.getHtype());
	    	  
			// execute query
			result = ps.executeUpdate();
		}  // end of try
		catch (SQLException se) {
			 se.printStackTrace();
			 throw se;
		}
		catch (Exception e) {
			  e.printStackTrace();
			  throw e;
		}
	// return the integer result value
		return result;
	}
	
	
	

}
