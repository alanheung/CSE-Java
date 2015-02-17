package com.mase.animals;

public class PetStore {
	public static void main(String[]args){
		Lizard lizzy = new Lizard();
		lizzy.eat();
		lizzy.walk();
		
		Pet pete = new Goldfish();
		pete.play();
		
		Dog lucky = new Dog();
		lucky.play();
		lucky.setName("poppy");
	}

	public void playWithGoldfish(Goldfish splash){
		splash.play();
	}
	public void playWithDogs(Dog bobby){
		bobby.play();
	}
	public void playWithPets(Pet todd){
		todd.play();
	}
}
