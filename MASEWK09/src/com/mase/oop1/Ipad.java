package com.mase.oop1;

public class Ipad extends Computer implements HighlyDesirable{

	public Ipad(String theMake, String theModel){

	}
	public void turnOn(){
		System.out.println("Ipad::TurnOn()");
	}
	public void turnOff(){
		System.out.println("Ipad::TurnOff()");
	}
	
	public boolean login(String user, String pass){
		System.out.println("Ipad user::"+user);
		System.out.println("Ipad pass::"+pass);
		return true;
	}

	public boolean logout(){
		System.out.println("Ipad logout");
		return true;
	}
	@Override
	public void sysout() {
		System.out.println("HighlyDesirable");		
	}
}
