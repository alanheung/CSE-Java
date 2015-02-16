package com.mase.polymorphism;

public class Instrument {
	public void play(){
		System.out.println("Instrument::play");;
	}
	public String what(){
		return "Instrument::what";
	}
	public void adjust(){
		System.out.println("Instrument::adjust");;
	}
}
