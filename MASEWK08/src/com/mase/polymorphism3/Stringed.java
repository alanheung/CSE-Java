package com.mase.polymorphism3;

public class Stringed implements Instrument {
	@Override
	public void play(){
		System.out.println("Stringed::play");;
	}
	@Override
	public String what(){
		return "Stringed::what";
	}
	@Override
	public void adjust(){
		System.out.println("Stringed::adjust");;
	}
}
