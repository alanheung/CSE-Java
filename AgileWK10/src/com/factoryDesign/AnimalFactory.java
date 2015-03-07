package com.factoryDesign;

public class AnimalFactory {
	
	public static Animal getAnimalObject(String type){
		
		if(type.equalsIgnoreCase("Cat")){
			System.out.println("This is a cat");
			return new Cat();
		}else{
			System.out.println("This is a dog");
			return new Dog();
		}
}
}
