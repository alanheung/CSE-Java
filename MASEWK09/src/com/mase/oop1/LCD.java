package com.mase.oop1;

public class LCD extends Television {
	public LCD(String theMake, String theModel){
		this.setTheMake(theMake);
		this.setTheModel(theModel);
	}
	public void turnOn(){
		System.out.println("LCD::TurnOn()");
	}
	public void turnOff(){
		System.out.println("LCD::TurnOff()");
	}
}
