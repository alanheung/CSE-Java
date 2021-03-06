package com.factoryDesign;

public class FactoryClient {

	public static void main(String[] args) {
		Animal animal = AnimalFactory.getAnimalObject("Cat");
		System.out.println(animal.walk());
		
		Animal a = new Animal();
		a.walk();
			
		Animal c = new Cat();
		c.walk();
		
		Animal d = new Dog();
		d.walk();
	}

}
