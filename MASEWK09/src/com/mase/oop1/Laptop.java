package com.mase.oop1;

public class Laptop extends Computer{
	
	public Laptop(String theMake, String theModel){

	}
	public void turnOn(){
		System.out.println("Laptop::TurnOn()");
	}
	public void turnOff(){
		System.out.println("Laptop::TurnOff()");
	}
	
	public boolean login(String user, String pass){
		System.out.println("Laptop user::"+user);
		System.out.println("Laptop pass::"+pass);
		return true;
	}

	public boolean logout(){
		System.out.println("Laptop logout");
		return true;
	}
}
