package com.mase.polymorphism2;

public abstract class Instrument {
	public abstract void play();
//	{
//		System.out.println("Instrument::play");;
//	}
	public String what(){
		return "Instrument::what";
	}
	public abstract void adjust();
//	{
//		System.out.println("Instrument::adjust");;
//	}
}
