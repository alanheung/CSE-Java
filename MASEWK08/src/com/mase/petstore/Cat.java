package com.mase.petstore;

public class Cat extends NameableImpl implements Pet,CanWalk{

	private Nameable nameable = new NameableImpl();
	private CanWalk itWalks;
	
	public Cat(){
		setName("Jessie");
		itWalks = new CanWalkImpl(4);
	}
	
	public Cat(String s){
		itWalks = new CanWalkImpl(4);
		setName(s);
	}

	@Override
	public String getName() {
		return this.nameable.getName();
	}

	@Override
	public void setName(String s) {
		nameable.setName(s);
	}

	public void eat(){
		System.out.println("Cats like to eat fish");
	}
	public void play() {
		System.out.println(getName()+"likes to play with string");

	}
	public void walk() {
		itWalks.walk();
	}
	
}
