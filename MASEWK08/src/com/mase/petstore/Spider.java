package com.mase.petstore;

public class Spider extends Animal implements CanWalk{

	private CanWalkImpl itWalks;

	public Spider(){
		itWalks = new CanWalkImpl(8);
	}

	public void eat(){
		System.out.println("The spider eats a fly");
	}

	@Override
	public void walk() {
		itWalks.walk();
	}
}
