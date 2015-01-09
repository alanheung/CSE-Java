package ait.ie.maths;

import java.util.Scanner;

public class Trig {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("This app will calculate the height of a " +
				"triangle given the angle of elevation and distance ");

		System.out.print("Enter the distance ");
		double distance = sc.nextDouble();
		System.out.print("Enter the degrees ");
		double degrees = sc.nextDouble();
	    double radians = Math.toRadians(degrees);

		double ans = (distance *Math.tan(radians));
				
	    System.out.print("The height is "+ (double)(Math.round(ans*100))/100);


	}

}
