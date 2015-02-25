package com.example.enums.complex;

public enum Direction {
	NORTH("in a northerly direction","AH"),
	SOUTH("in a southerly direction","AH"),
	EAST("in a easterly direction","AH"),
	WEST("in a westerly direction","AH");//ctor calls
	
	String direction, name;
	Direction(String direction, String name){
		this.direction=direction;
		this.name=name;
	}
	
	@Override
	public String toString(){
		return "We are travelling "+direction;
	}
	
}
