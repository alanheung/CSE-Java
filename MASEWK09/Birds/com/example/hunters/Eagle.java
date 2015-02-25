package com.example.hunters;

import com.example.localbirds.Crow;

public class Eagle {

	private String name;

	public Eagle(){
		name = "Eagle";
	}
	protected String getName(){
		return name;
	}
	@Override
	public String toString() {
		return "Eagle [name=" + name + "]";
	}

	public static void main(String[]args){
		Crow crow = new Crow();
		System.out.println(crow);
	}
}
