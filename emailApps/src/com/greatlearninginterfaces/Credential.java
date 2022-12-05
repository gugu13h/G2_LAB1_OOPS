package com.greatlearninginterfaces;

import com.greatlearning.model.Employee;

public interface Credential {
	
public String generateEmailAddress(String firstName,String lastName,String department);
	
	public String generatePassword();
	
	public  void showCredentials(Employee employee);
	
	

}
