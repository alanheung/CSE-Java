package ait.com.test;

import java.util.ArrayList;

public class EmployeeSys {
//	private ArrayList<Employee> empSys;
	ArrayList employees = new ArrayList();//
	private boolean userLoggedIn;
	private String password;
	private String username;
	private static int numberOfEmployees;//
	
	public EmployeeSys(){
//		empSys = new ArrayList<Employee>();
		userLoggedIn =false;
		password ="root";
		username ="admin";
		numberOfEmployees =0;//
		
	}
//	public EmployeeSys(boolean userLoggedIn,String password,String username){
//		this.userLoggedIn =userLoggedIn;
//		this.password =password;
//		this.username =username;
//	}
//	public boolean isUserLoggedIn() {
//		return userLoggedIn;
//	}
//	public void setUserLoggedIn(boolean userLoggedIn) {
//		this.userLoggedIn = userLoggedIn;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
	//
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
