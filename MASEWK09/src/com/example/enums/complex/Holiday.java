package com.example.enums.complex;

import static com.example.enums.complex.Direction.*;

public class Holiday {

	public static void main(String[] args) {
		//goSomewhere(Direction.NORTH);//commented after the import statement
		goSomewhere(NORTH);//uses the import
		
		//Direction d = Direction.SOUTH;
		Direction d = SOUTH;//uses the import
		goSomewhere(d);
	}

	public static void goSomewhere(Direction d){
		System.out.println(d);
	}
}
