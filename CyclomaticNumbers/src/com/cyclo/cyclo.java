package com.cyclo;

public class cyclo {

	public static void main(String[] args) {

	}
	public static void simpleIf(int inputValue){
		if(inputValue <=0){
			System.out.println("Error");
		}
	}
	public static void simpleIfElse(int inputValue){
		if(inputValue <=0){
			System.out.println("Error");
		}else{
			System.out.println("Valid Value");
		}
	}
	public static void simpleSwitch(int inputValue){
		switch(inputValue){
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Not One, Two or Three");
			break;
		}
	}
	
	public static void simpleLoopWithIf(int inputValue){
		for(int i=0; i<inputValue; i++){
			System.out.println(i);
			if(i==6){
				i+=3;
			}
		}
	}
	
	public static String getWeight(int i){
		if(i <=0){
			return "no weight";
		}
		if(i < 10){
			return "light";
		}
		if(i < 20){
			return "medium";
		}
		if(i < 30){
			return "heavy";
		}
		return "very heavy";
	}




}
