package com.mase.animals;

public class Goldfish extends Animal implements Pet{

	private String name;
	private Owner owner;
	
	public Goldfish(){
		super(legs);
	}
	public void walk(){
		System.out.println("Goldfish::walk");
	}
	@Override
	public String getName() {
		System.out.println("Goldfish::getName");
		return null;
	}
	@Override
	public String setName(String s) {
		System.out.println("Goldfish::setName");
		return null;
	}
	@Override
	public void play() {
		System.out.println("Goldfish::play");
	}
}
