package com.mase.polymorphism2;

public class Stringed extends Instrument {
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
