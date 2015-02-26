package com.mase.oop1;

public class Television implements ElectronicDevice{
	private String theMake;
	private String theModel;
	
	public Television(){
		theMake="";
		theModel="";
	}
	public Television(String theMake, String theModel) {
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
		return "Television [theMake=" + getTheMake() + ", theModel=" + theModel
				+ "]";
	}

	@Override
	public void turnOn() {
		System.out.println("Television::turnOn()");		
		
	}

	@Override
	public void turnOff() {
		System.out.println("Television::turnOn()");		
		
	}
}
