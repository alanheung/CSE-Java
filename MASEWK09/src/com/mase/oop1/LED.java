package com.mase.oop1;

public class LED extends Television{
	
	public LED(String theMake, String theModel){
		this.setTheMake(theMake);
		this.setTheModel(theModel);
	}
	public void turnOn(){
		System.out.println("LED::TurnOn()");
	}
	public void turnOff(){
		System.out.println("LED::TurnOff()");
	}
}
