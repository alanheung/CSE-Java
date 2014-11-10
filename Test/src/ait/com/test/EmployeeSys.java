package ait.com.test;

import java.util.ArrayList;

public class EmployeeSys {
	private ArrayList<Employee> empSys;

	private boolean userLoggedIn;
	private String password;
	private String username;
	
	public EmployeeSys(){
		empSys = new ArrayList<Employee>();
		userLoggedIn =false;
		password ="root";
		username ="admin";
	}
	public EmployeeSys(boolean userLoggedIn,String password,String username){
		this.userLoggedIn =userLoggedIn;
		this.password =password;
		this.username =username;
	}
//	user logged in
	public boolean isUserLoggedIn() {
		return userLoggedIn;
	}
	public void setUserLoggedIn(boolean userLoggedIn) {
		this.userLoggedIn = userLoggedIn;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
//	addEmployees
	public void addEmployee(Employee aEmployee){
		empSys.add(aEmployee);
	}
	public int getNumberOfEmployees(){
		return empSys.size();
	}
	public void deleteEmployee(Employee aEmployee){
		empSys.remove(aEmployee);
	}

//	public void loggedIn(Employee aEmployee){
//		aEmployee.setUserLoggedIn(true);
//	}	
//	public void	notLoggedIn(Employee aEmployee){
//		aEmployee.setUserLoggedIn(false);
//	}

	//	public boolean changePassword
	public boolean checkUsername(String name){
		boolean found=false;
		for(Employee emp: empSys){
			if(emp.getUserame().equals(name)){
				found=true;
			}
		}
		return found;
	}
	public boolean checkPassword(String name){
		boolean found=false;
		for(Employee emp: empSys){
			if(emp.getPassword().equals(name)){
				found=true;
			}
		}
		return found;
	}

}
