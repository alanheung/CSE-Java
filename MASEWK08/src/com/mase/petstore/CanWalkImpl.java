package com.mase.petstore;

public class CanWalkImpl implements CanWalk{
	protected static int legs;

	public CanWalkImpl(int legs){
		this.legs=legs;
	}

	@Override
	public void walk() {
		System.out.println("This animal walks on "+legs+" legs");		
	}

}
