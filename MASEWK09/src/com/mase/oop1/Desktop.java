package com.mase.oop1;

public class Desktop extends Computer {

	public Desktop(String theMake, String theModel){

	}
	public void turnOn(){
		System.out.println("Desktop::TurnOn()");
	}
	public void turnOff(){
		System.out.println("Desktop::TurnOff()");
	}
	
	public boolean login(String user, String pass){
		System.out.println("Desktop user::"+user);
		System.out.println("Desktop pass::"+pass);
		return true;
	}

	public boolean logout(){
		System.out.println("Desktop logout");
		return true;
	}
}
