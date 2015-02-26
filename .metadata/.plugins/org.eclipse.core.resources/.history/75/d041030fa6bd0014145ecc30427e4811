package com.mase.oop1;

public class Person implements ElectronicDevice{
	protected String name;
	protected Purchase purchase;
	
	public Person(String n, Purchase p){
		this.name=n;
		this.purchase=p;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", purchase=" + purchase + "]";
	}

	@Override
	public void turnOn() {		
		System.out.println("Person::turnOn");
	}

	@Override
	public void turnOff() {	
		System.out.println("Person::turnOff");
	}

	@Override
	public String getTheMake() {
		return null;
	}

	@Override
	public String getTheModel() {
		return null;
	}
	
}
