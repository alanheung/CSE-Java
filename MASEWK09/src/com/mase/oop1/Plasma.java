package com.mase.oop1;

public class Plasma extends Television implements HighlyDesirable{
	
	public Plasma(String theMake, String theModel){
		this.setTheMake(theMake);
		this.setTheModel(theModel);
	}
	public void turnOn(){
		System.out.println("Plasma::TurnOn()");
	}
	public void turnOff(){
		System.out.println("Plasma::TurnOff()");
	}
	@Override
	public void sysout() {
		System.out.println("HighlyDesirable");
	}
}
