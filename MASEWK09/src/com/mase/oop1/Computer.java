package com.mase.oop1;

public class Computer implements ElectronicDevice{
	private String theMake;
	private String theModel;

	public Computer(){
		theMake="";
		theModel="";
	}
	public Computer(String theMake, String theModel) {
		this.theMake=theMake;
		this.theModel=theModel;
	}
	public String getTheMake() {
		return theMake;
	}
	public String getTheModel() {
		return theModel;
	}
	public void setTheMake(String theMake) {
		this.theMake = theMake;
	}

	public void setTheModel(String theModel) {
		this.theModel = theModel;
	}
	@Override
	public String toString() {
		return "Computer [theMake=" + theMake + ", theModel=" + theModel + "]";
	}

	public boolean login(String user, String pass){
		System.out.println("Computer user::"+user);
		System.out.println("Computer pass::"+pass);
		return true;
	}

	public boolean logout(){
		System.out.println("Computer logout");
		return true;
	}
	@Override
	public void turnOn() {
		System.out.println("Computer::turnOn()");		
	}
	@Override
	public void turnOff() {
		System.out.println("Computer::turnOff()");		

	}	
}
