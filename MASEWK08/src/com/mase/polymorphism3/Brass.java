package com.mase.polymorphism3;

public class Brass extends Wind implements Instrument {
	@Override
	public void play(){
		System.out.println("Brass::play");;
	}
	@Override
	public void adjust(){
		System.out.println("Brass::what");;
	}
}
