package com.ait.employees;
import java.util.ArrayList;

public class EmployeeApp {
	
private ArrayList<Employee> employees;
	
	public EmployeeApp(){
		employees = new ArrayList<Employee>();
	}
	public int getNumberOfEmployees(){
		return employees.size();
	}
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	public boolean findEmployeeByName(String name){
		boolean employeeFound=false;
		for(Employee employee :employees){
			if(employee.getName().equals(name)){
				employeeFound=true;
			}
		}
		return employeeFound;
	}
	public void removeEmployee(Employee employee){
		employees.remove(employee);
	}
}
