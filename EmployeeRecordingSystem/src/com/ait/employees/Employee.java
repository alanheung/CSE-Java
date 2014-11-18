package com.ait.employees;

public class Employee {
	private String ppsNumber;
	private String name;
	private int age;
	
	Employee(){
		ppsNumber ="";
		name ="";
		age = 0;
	}
	
	Employee(String aPpsNumber, String aName, int aAge){
		ppsNumber = aPpsNumber;
		name = aName;
		age = aAge;
	}
	
	public void setPpsNumber(String aPpsNumber){
		ppsNumber = aPpsNumber;
	}
	
	public String getPpsNumber(){
		return ppsNumber;
	}
	
	public void setName(String aName){
		name = aName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int aAge){
		age = aAge;
	}
	
	public int getAge(){
		return age;
	}
	
}
