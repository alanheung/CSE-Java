package com.mase.oop1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Shop {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Person> people = new ArrayList<>();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		//Tom
		Date dateOfPurchase = formatter.parse("30/01/15");

		ElectronicDevice ed = new Plasma("Sony","Bravia");//created new plasma television

		Purchase purchase = Purchase.createNewInstance("Sony Shop", 499.0, dateOfPurchase, ed);
		System.out.println("\n"+purchase);

		Person p1 = new Person("Tom", purchase);

		System.out.println("\n"+p1);processPeople(people);//method call
		System.out.println();

		//Ann
		Date dateOfPurchase2 = formatter.parse("10/02/15");

		ElectronicDevice ed2 = new Laptop("Apple","Macbook");//created new computer laptop

		Purchase purchase2 = Purchase.createNewInstance("Apple Store", 999.0, dateOfPurchase2, ed2);
		System.out.println("\n"+purchase2);

		Person p2 = new Person("Ann", purchase2);

		System.out.println("\n"+p2);processPeople(people);//method call
		System.out.println();
		
		
	}
	public static void processPeople(ArrayList<Person> people){
		
		System.out.println(people);
		if(people instanceof HighlyDesirable){ //trying to see if the people are an instance of the HighlyDesirable interface
			System.out.println("This device is highly desirable "+people.getClass().getSimpleName()); 
		} else{ 
			System.out.println("This device is not highly desirable "+people.getClass().getSimpleName()); 
		} 

	}

}
