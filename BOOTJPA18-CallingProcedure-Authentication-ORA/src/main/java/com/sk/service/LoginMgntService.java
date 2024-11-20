package com.sk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@SuppressWarnings("all")
@Service("loginService")
public class LoginMgntService implements ILoginMgmtService {
	
	@Autowired
	private EntityManager manager;
	
	/*
	 
	 CREATE DEFINER=`root`@`localhost` PROCEDURE `P_AUTHENTICATION`(
 in uname varchar(20),
 in pwd varchar(20),
 out result varchar(20)
)
BEGIN
declare cnt int(2);
select count(*) into cnt from login_info where username=uname and password=pwd;

if(cnt<>0) then
  set result = "valid credential";
 else 
   set result = "Invalid Credential";
  end if; 
END
	 */
	
	@Override
	public String doLogin(String user, String pwd) {
        
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_AUTHENTICATION");
		
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		
		query.setParameter(1, user);
		query.setParameter(2, pwd);
		
		String msg =(String) query.getOutputParameterValue(3);
		
		return msg;
	}

}
