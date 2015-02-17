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
		System.out.println("Dog::getName");
		return null;
	}
	@Override
	public String setName(String s) {
		System.out.println("Dog::"+s);
		return null;
	}
	@Override
	public void play() {
		System.out.println("Dog::play");

	}
}
