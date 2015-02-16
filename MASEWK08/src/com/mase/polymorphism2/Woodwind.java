package com.mase.polymorphism2;

public class Woodwind extends Wind {
	@Override
	public void play(){
		System.out.println("Woodwind::play");;
	}
	@Override
	public String what(){
		return "Woodwind::what";
	}
}
