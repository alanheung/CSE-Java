package com.example.enums.simple;


public class EnumTest {

	Day day;//an instance variable of type Day named day (package access)

	//Day monday = Day.MONDAY;

	//a public constructor that enables an external class to initialise the 
	//instance variable
	public EnumTest(Day day){
		this.day=day;
	}
	/**
	o	a method named tellItLikeItIs that takes no parameters and returns 
	nothing (it has public access but is not static); in this method switch on the 
	instance enumeration variable outputting that “Mondays are bad”, “Fridays are better”, 
	“Weekends are best” and “midweek days are ok”.*/
	public void tellItLikeItIs(){
		switch(day){
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case FRIDAY:
			System.out.println("Fridays are better");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best");
			break;
		default:
			System.out.println("Midweek days are OK");
			break;
		}
	}
	
	public static void main(String[]args){
//declare an object of type EnumTest passing in Monday; then invoke the 
//method tellItLikeItIs().
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumTest secondDay = new EnumTest(Day.TUESDAY);
		secondDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTest fourthDay = new EnumTest(Day.THURSDAY);
		fourthDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}

}//
