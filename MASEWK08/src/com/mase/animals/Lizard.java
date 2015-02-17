package com.mase.animals;

public class Lizard extends Animal{
	private static Owner owner;
	
	public Lizard(){
		super(4);
		System.out.println("Lizard::lizard");
	}
}
