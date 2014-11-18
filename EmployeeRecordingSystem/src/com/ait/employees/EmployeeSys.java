package com.ait.employees;

import java.util.ArrayList;
public class EmployeeSys {
	private boolean userLoggedIn;
	private String password;
	private String username;
	private static int numberOfEmployees;
	ArrayList employees = new ArrayList();
	EmployeeSys(){
		
		userLoggedIn = false;
		password = "admin";
		username ="root";
		numberOfEmployees =0;
	}
	
	public boolean login(String aUsername, String aPassword){
		boolean valid = false;
		if(aUsername.equals(username) && aPassword.equals(password)){
			userLoggedIn = true;
			valid = true;
		}	
		return valid;
	}
	
	public int getNumberOfEmployees(){
		return numberOfEmployees;
	}
	
	public boolean addEmployee(Employee employee){
		if(userLoggedIn==true){
			numberOfEmployees+=1;
			employees.add(employee);
		}
		
		return userLoggedIn;
	}
	
	public void logOut(){
		userLoggedIn= false;
	}
}
