package com.mase.polymorphism3;

public class Woodwind extends Wind implements Instrument  {
	@Override
	public void play(){
		System.out.println("Woodwind::play");;
	}
	@Override
	public String what(){
		return "Woodwind::what";
	}
}
