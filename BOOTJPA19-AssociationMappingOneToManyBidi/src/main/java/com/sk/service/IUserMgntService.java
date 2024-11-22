package com.sk.service;

public interface IUserMgntService {
	
	public String saveDataUsingParent();
	public String saveDataUsingChild();
	
	public void loadDataUsingParent();
	public void loadDataUsingChild();

	public void deleteDataUsingParent(); 
	public void deleteUserPhoneNumberOnly();
	
	public void addingNewChildToAParentById();
	public void deleteDataUsingChild(); 
	
	
}
