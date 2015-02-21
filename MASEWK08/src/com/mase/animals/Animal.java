package com.mase.animals;

public class Animal {
	protected static int legs;
	
	public Animal(int i){
		this.legs=i;
		System.out.println();
	}
	
	public void walk(){
		System.out.println("Animal::walk");
	}
	
	public void eat(){
		System.out.println("Animal::eat");
	}
}
