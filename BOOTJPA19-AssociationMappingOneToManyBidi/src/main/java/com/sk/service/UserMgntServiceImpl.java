package com.sk.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.PhoneNumber;
import com.sk.entity.User;
import com.sk.repositoty.IPhoneNumberRepository;
import com.sk.repositoty.IUserRepository;

@Service("custService")
public class UserMgntServiceImpl implements IUserMgntService {

	@Autowired
	private IUserRepository userRepo;
	@Autowired
	private IPhoneNumberRepository phonerepo;
		
	@Override
	public String saveDataUsingParent() {

   // create parent Object 
		User user = new User( "raja", "hyd");
		
		// Create child object 
		PhoneNumber ph1 = new PhoneNumber(909090L,"Airtel","office");
		PhoneNumber ph2 = new PhoneNumber(8008080L,"BSL","service");
		
		 // set parent to childs
	    ph1.setUser(user);
	    ph2.setUser(user);

	    // set childs to parent
	    Set<PhoneNumber> childs = Set.of(ph1, ph2);
	      user.setPhoneInfo(childs);

	    // save parent to childs
	    int idVal = userRepo.save(user).getUno();
	    
	    return "Parent to Childs objs are saved with the id Value:" + idVal;


	}
	
	//  ===========================================================================

	@Override
	public String saveDataUsingChild() {
	

		   // create parent Object 
				User user = new User( "Mahesh", "delhi");
				
				// Create child object 
				PhoneNumber ph1 = new PhoneNumber(6969696L,"Airtel","work");
				PhoneNumber ph2 = new PhoneNumber(9696969L,"BSL","FarmHouse");
				
				 // set parent to childs
			    ph1.setUser(user);
			    ph2.setUser(user);

			    // set childs to parent
			    Set<PhoneNumber> childs = new HashSet();
			    childs.add(ph1);
			    childs.add(ph2);
			      user.setPhoneInfo(childs);
			      
			      // Save Object Using Child
			      
			      phonerepo.saveAll(childs);
			      
			      
		return "Child to Parent object are saved" ;
	}

	//==============================================================================
	
	@Override
	public void loadDataUsingParent() {

		Iterable<User> it = userRepo.findAll();
		it.forEach((user)->{
			
			System.out.println("Parent :: "+user);
			
			Set<PhoneNumber> childs = user.getPhoneInfo();
			childs.forEach((ch)->{
				System.out.println("Child :: "+ch);
			});
			
		});
	}
	
	@Override
	public void loadDataUsingChild() {
		Iterable<PhoneNumber> it = phonerepo.findAll();
		it.forEach((childs)->{
			
			System.out.println("Child :: "+childs);
			
			User user = childs.getUser();
			System.out.println("Parent ::" +user );
		});
		
	}

} // end of class
