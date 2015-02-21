package com.mase.petstore;

public class Fish extends Animal implements Pet{

	private Nameable nameable = new NameableImpl();

	public void eat(){
		System.out.println("Fish eat plankton"); 
	}

	@Override
	public void setName(String s) {
		this.nameable.setName(s);		
	}

	@Override
	public String getName() {
		return nameable.getName();
	}

	@Override
	public void play() {
		System.out.println("Fish just swim");
	}
}
