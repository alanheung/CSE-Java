package com.mase.animals;

public class Dog extends Animal implements Pet {
	
	private static Owner owner;
	private static String name;

	public Dog(){
		super(4);
		System.out.println("Dog::dog");
		owner = new Owner("Dude");
	}
	
	public Dog(String name) {
		super(4);
		System.out.println("Dog::dog");
	}

	@Override
	public String getName() {
		return "Dog::getName";
	}
	@Override
	public String setName(String s) {
		return "Dog::"+s;
		
	}
	@Override
	public void play() {
		System.out.println("Dog::play");

	}
}
