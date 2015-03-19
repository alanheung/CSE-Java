package com.mase.oop1.code2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CodeAssessment2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		final int   STRINGS = 1, EXCEPTIONS = 2, INNER_CLASSES = 3, FILE_IO = 4, ENUMS=5, EXIT = 99;
		String userContinue = "y";
		System.out.println("Code Assesment 2");
		while (userContinue.equalsIgnoreCase("y")) {
			switch (userChoice()) {
			case STRINGS:
				stringBuilder();
				break;
			case EXCEPTIONS:
				method1();
				break;
			case INNER_CLASSES:
				innerClasses();
				break;
			case FILE_IO:
				fileIO();
				break;
			case ENUMS:
				enums();
				break;
			case EXIT:
				System.out.println("Exiting...");
				userContinue = "n";
				break;
			default:
				System.out.println("Unknown entry : ");
				break;
			}
		}
	}
	//menu
	public static int userChoice() {

		System.out.println("What do you want to do ?\n1. String Builder\n2. Exceptions\n3. Inner Classes\n4. File I/O\n5. Enumerations\n99. Exit\nEnter choice: ");
		return sc.nextInt();

	}
	//1. string builder
	public static void stringBuilder(){

		StringBuilder sb = new StringBuilder();

		// the timetable (given)
		sb.append("Java Fundamentals Web Development2.1 Web Development4 SOA\n");
		sb.append("Web Development2.1 Java Fundamentals Web Development4 SOA\n");
		sb.append("Web Development4 Java Fundamentals Web Development2.1 SOA\n");
		sb.append("SOA Java Fundamentals Web Development4 Web Development2.1\n");
		sb.append("Web Development4 Web Development2.1 Java Fundamentals SOA\n");

		//insert days of the week
		sb.insert(0, "Monday ");
		sb.insert(sb.indexOf("Web Development2.1 Java Fundamentals Web Development4 SOA"), "Tuesday ");
		sb.insert(sb.indexOf("Web Development4 Java Fundamentals Web Development2.1 SOA"), "Wednesday ");
		sb.insert(sb.indexOf("SOA Java Fundamentals Web Development4 Web Development2.1"), "Thursday ");
		sb.insert(sb.indexOf("Web Development4 Web Development2.1 Java Fundamentals SOA"), "Friday ");

		//insert times
		sb.insert(sb.indexOf("Java Fundamentals Web Development2.1 Web Development4 SOA", sb.indexOf("Monday")), ": 0900-1700 W301: ");
		sb.insert(sb.indexOf("Web Development2.1 Java Fundamentals Web Development4 SOA", sb.indexOf("Tuesday")), ": 0900-1700 X206: ");
		sb.insert(sb.indexOf("Web Development4 Java Fundamentals Web Development2.1 SOA", sb.indexOf("Wednesday")), ": 0900-1700 X205: ");
		sb.insert(sb.indexOf("SOA Java Fundamentals Web Development4 Web Development2.1", sb.indexOf("Thursday")), ": 0900-1700 X205: ");
		sb.insert(sb.indexOf("Web Development4 Web Development2.1 Java Fundamentals SOA", sb.indexOf("Friday")), ": 0900-1700 X205: ");

		while(sb.indexOf("SOA") !=-1){

			sb.replace(sb.indexOf("SOA"),
					sb.indexOf("SOA") + "SOA".length(),
					"Service Oriented Architecture");

		}
		System.out.println(sb);

	}
	//exceptions
	public static void method1(){

		method2();

	}

	public static void method2(){

		try{
			method3();
		}
		catch (MaseException e){
			System.out.println("Throws MaseException. " + e.getCause().toString());
		}

	}

	public static void method3() throws MaseException{

		try{
			throw new IOException("An I/O exception occurred.");
		}
		catch (IOException e){
			throw new MaseException(e);
		}

	}
	//innerclasses
	public static void innerClasses(){

		System.out.println("Creating the Laptop class...");
		Laptop laptop = new Laptop();
		System.out.println("Creating the private inner class object accessible via an interface reference...");
		Memoryl mem = laptop.getMemoryCapacity("4MB","4MB");
		System.out.println("The memory capacity is "+mem.getMemoryCapacity());

	}
	//file I/O
	public static void fileIO(){

		ArrayList<Car> cars = new ArrayList<>();

		try {
			BufferedReader in = new BufferedReader(new FileReader("cars.txt"));//reads car file
			String line = in.readLine();
			while(line != null){

				String []columns = line.split("\t");// split via a tab
				String reg = columns[0];
				String make = columns[1];
				String model = columns[2];
				String tag = columns[3];
				String price = columns[4];

				cars.add(new Car(reg, make, model, tag, Double.parseDouble(price)));

				line = in.readLine();
			}
			in.close();
			//print array
			for(Car c:cars){
				System.out.println(c);                
			}
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	//enumerations
	public static void enums(){

		FarmerType john = FarmerType.BEEF;
		double grant = calculateGrant(500, john);
		System.out.println("John is a : " + john.toString());
		System.out.println("John's grant is: " + grant);  

	}
	//calculate the grant according to the farmer type
	public static double calculateGrant(int numAcres, FarmerType fType){

		double grant = 0;

		if (fType == FarmerType.DAIRY){
			if(numAcres < 200){
				grant = numAcres*200;
			}else{
				grant = numAcres*50;
			}
		}else if (fType == FarmerType.BEEF){
			if(numAcres < 200){
				grant = numAcres*300;
			}else{
				grant = numAcres*80;
			}        
		}else if (fType == FarmerType.SHEEP){
			if(numAcres < 200){
				grant = numAcres*150;
			}else{
				grant = numAcres*40;
			}        }
		return grant;

	}

}


