package com.mase.polymorphism2;

public class Wind extends Instrument {
	@Override
	public void play(){
		System.out.println("Wind::play");;
	}
	@Override
	public String what(){
		return "Wind::what";
	}
	@Override
	public void adjust(){
		System.out.println("Wind::adjust");;
	}
}
