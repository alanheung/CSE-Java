package com.mase.horrorshow;

public class Dracula implements Vampire{

	@Override
	public void kill() {
		System.out.println("Dracula::kill");
	}

	@Override
	public void destroy() {
		System.out.println("Dracula::destroy");
	}

	@Override
	public void menace() {
		System.out.println("Dracula::menace");
	}

	@Override
	public void drinkBlood() {
		// TODO Auto-generated method stub
		System.out.println("Dracula::drinkBlood");
	}
}
