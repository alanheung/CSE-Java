// if exercises
//1. read a month number from the user. Using an if construct, output the text for that month
//eg January, etc. Allow for entries which are out of range.
//a. Put the code into a method ifMonth() and call it from main
//b. Protect the if statement to cater for exceptions eg entering a letter instead of a number: throws a InputMismatchException
//2. check two numbers entered by user are negative, greater than each other, equal to each other.
//3. read in a numeric mark(whole number) from the user.If mark is a negative or greater than 100, flag an error showing the erroneous value. 
//Determine the grade based on the following 70-100 A, 60-69- B, 50-59 C, 40-49 D, otherwise fail
//a.insert the code into method ifGrade() and call from main
//b. allow for exceptions
//4. get temperature -10 +2 very cold, 3-9 cold, 10-14 mild, 15-20 warm, 21-27 very warm, 28-31 hot, if not extreme temperature
//5. get three whole numbers, find the largest
//6.
//9.ternaryOperator set boolean to isHappy 
//true set string named mood to i am happy or i am sad depending on ishappy. expand to x and y
import java.util.Scanner;

public class IfExercises {
	public static void main(String[] args) {
		//ifMonth();
		//largerOfTwoNumbers();
		//ifGrade();
		//ifTemperature();
		//ifLargest();
		//ifSmallest();
		//ifLargest3();//2 largest numbers
		//ifLargest2();
		//ifSmallest2();
		ternaryOperator();
		
//		System.out.println("in main() 1...");
//		someMethod();
//		System.out.println("in main() 2...");

	}
	
	public static void ternaryOperator(){
		Scanner sc = new Scanner(System.in);

		boolean isHappy = true;
		String mood = isHappy ? "I am happy" : "I am sad";
		System.out.println(mood);
		
		int x=0, y=0, minVal=0;
		System.out.println ("Please enter x: ");
		x = sc.nextInt();
		System.out.println ("Please enter y: ");
		y = sc.nextInt();
		
		minVal = x < y ? x:y;
		System.out.println ("minVal is " +minVal);
	}

	public static void ifSmallest2(){
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println ("Please enter your first number: ");
			num1 = sc.nextInt();
			System.out.println ("Please enter your second number: ");
			num2 = sc.nextInt();
			System.out.println ("Please enter your third number: ");
			num3 = sc.nextInt();
			
			if(num1 <= num2){
				if(num1 <= num3){
					System.out.println (num1+" is the smallest number");
				}
			}else if(num2 <= num1){ 
				if(num2 <= num3){
				System.out.println (num2+" is the smallest number");
				}
			}else if(num3 <= num1){
				if(num3 <= num2){
					System.out.println (num3+" is the smallest number");
				}
			}	
		}catch(Exception e ){
				System.out.println ("Exception caught...");
				e.printStackTrace();
		}
	}
	public static void ifLargest2(){
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println ("Please enter your first number: ");
			num1 = sc.nextInt();
			System.out.println ("Please enter your second number: ");
			num2 = sc.nextInt();
			System.out.println ("Please enter your third number: ");
			num3 = sc.nextInt();
			
			if(num1 >= num2){  
				if(num1 >= num3){
					System.out.println(num1+" is the largest number");
				}
			}else if(num2 >= num1){ 
					if(num2 >= num3){
						System.out.println(num2+" is the largest number");
					}	
			}else if(num3 >= num1){
				if(num3 >= num2){
					System.out.println(num3+" is the largest number");
				}
			}else{
				System.out.println("You have encountered an error");
			}	
		}catch(Exception e ){
				System.out.println ("Exception caught...");
				e.printStackTrace();
		}
	}
	
	public static void ifLargest3(){
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println ("Please enter your first number: ");
			num1 = sc.nextInt();
			System.out.println ("Please enter your second number: ");
			num2 = sc.nextInt();
			System.out.println ("Please enter your third number: ");
			num3 = sc.nextInt();
			
			if(num1 > num2 && num1 > num3 && num2 > num3){
				System.out.println (num1 + " and "+ num2 +" are larger than "+num3);
			}else if(num2 > num1 && num2 > num3 && num3 > num1){
				System.out.println (num2 + " and "+ num3 +" are larger than "+num1);
			}else{
				System.out.println (num1 + " and "+ num3 +" are larger than "+num2);
			}
		}catch(Exception e ){
				System.out.println ("Exception caught...");
				e.printStackTrace();
		}
	}
	
	public static void ifSmallest(){
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println ("Please enter your first number: ");
			num1 = sc.nextInt();
			System.out.println ("Please enter your second number: ");
			num2 = sc.nextInt();
			System.out.println ("Please enter your third number: ");
			num3 = sc.nextInt();
			
			if(num1 <= num2 && num1 <= num3){
				System.out.println (num1+" is the smallest number");
			}else if(num2 <= num1 && num2 <= num3){
				System.out.println (num2+" is the smallest number");
			}else if(num3 <= num1 && num3 <= num2){
					System.out.println (num3+" is the smallest number");
			}
		}catch(Exception e ){
				System.out.println ("Exception caught...");
				e.printStackTrace();
		}
	}
	
	public static void ifLargest(){
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println ("Please enter your first number: ");
			num1 = sc.nextInt();
			System.out.println ("Please enter your second number: ");
			num2 = sc.nextInt();
			System.out.println ("Please enter your third number: ");
			num3 = sc.nextInt();
			
			if(num1 > num2 && num1 > num3){
				System.out.println (num1+" is larger than "+num2+" and "+num3);
			}else if(num2 > num1 && num2 > num3){
				System.out.println (num2+" is larger than "+num1+" and "+num3);
			}else if(num3 > num1 && num3 > num2){
					System.out.println (num3+" is larger than "+num1+" and "+num2);
			}else if(num1 == num2 && num1 > num3){
				System.out.println (num1+" is the largest number");
			}else if(num2 == num3 && num2 > num1){
				System.out.println (num2+" is the largest number");
			}else{//if (num1 == num3 && num1 > num2){
				System.out.println (num3+" is the largest number");
			}
		}catch(Exception e ){
				System.out.println ("Exception caught...");
				e.printStackTrace();
		}
	}
//	if(num1 => num2 && num1 => num3){ check if two numbers are equal and greater than
//		System.out.println (num1+" is larger than "+num2+" and "+num3);
//	}else if(num2 => num1 && num2 => num3){
//		System.out.println (num2+" is larger than "+num1+" and "+num3);
//	}else if(num3 => num1 && num3 => num2){
//			System.out.println (num3+" is larger than "+num1+" and "+num2);

	public static void ifTemperature(){
		int temp;
		final int VERY_COLD = 2;
		final int COLD = 9;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");

		try{
			temp = sc.nextInt();			
			if(temp < -10 || temp >31 ){
				System.out.print(temp+ " is an extreme temperature. ");
			}else{
				if(temp <= VERY_COLD){
					System.out.print(temp+ " is very cold. ");
				}else if(temp <= COLD){
					System.out.print(temp+ " is cold. ");
				}else if(temp <= 14){
					System.out.print(temp+ " is mild. ");
				}else if(temp <= 20){
					System.out.print(temp+ " is warm. ");
				}else if(temp <= 27){
					System.out.print(temp+ " is very warm. ");
				}else{
					System.out.print(temp+ " is hot. ");																		
				}
			}
		}catch(Exception e ){
			System.out.println ("Exception caught...");
			e.printStackTrace();
		}
	}
	
	public static void ifGrade(){//other way is to check for if 0-100 else then check for grade nested if, else if
		int x;
		Scanner sc = new Scanner(System.in);
	
		try{
			System.out.print("Please enter grade: ");
			x = sc.nextInt();
	
			if(x >= 70 && x <=100 ){
				System.out.print( x + " is an A grade. ");
			}else if(x >= 60 && x <=69){
				System.out.print( x + " is a B grade. ");
			}else if(x >= 50 && x <=59){
				System.out.print( x + " is a C grade. ");
			}else if(x >= 40 && x <=49){
				System.out.print( x + " is a D grade. ");
			}else if(x >= 0 && x <=39){
				System.out.print( x + " is a fail grade. ");
			}else{
				System.out.print( x + " is not gradable. ");
			}
		}catch(Exception e ){
			System.out.println ("Exception occured");
			e.printStackTrace();
		}
	}
	public static void largerOfTwoNumbers(){
		int x, y;
		Scanner sc = new Scanner(System.in);
	
		try{
			//this is the logic
			System.out.print("Please enter x: ");
			x = sc.nextInt();
			System.out.print("Please enter y: ");
			y = sc.nextInt();
			if(x <= 0 || y <=0 ){
				System.out.println ("You have entered a negative number");
			}else if(x >0 && y >0){// checking positive
				if(x>y){//checking if x is greater than y
					System.out.println(x +" is greater than "+y);
				}else if(x == y){
					System.out.println(x +" is equal to "+y);
				}else
					System.out.println(y +" is greater than "+x);
			}	
		}catch(Exception e ){
			//error handling
			System.out.println ("Exception occured");
			e.printStackTrace();
		}
	}
	
	public static void ifMonth(){
		System.out.println ("This program converts a number into a month ");
		int month = 0;
		final int JAN=1;// using constant is easier to read for programming
		final int FEB=2;
		final int MAR=3;
		final int APR=4;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter the month: ");
		
		try{
			//this is the logic
			//normal code
			month = sc.nextInt();
			if(month == JAN){
				System.out.println("January");
			}else if(month == FEB){
				System.out.println("February");
			}else if(month == MAR){
				System.out.println("March");
			}else if(month == APR){
				System.out.println("April");
			}else if(month == 5){
				System.out.println("May");
			}else if(month == 6){
				System.out.println("June");
			}else if(month == 7){
				System.out.println("July");
			}else if(month == 8){
				System.out.println("August");
			}else if(month == 9){
				System.out.println("September");
			}else if(month == 10){
				System.out.println("October");
			}else if(month == 11){
				System.out.println("November");
			}else if(month == 12){
				System.out.println("December");
			}else{
				System.out.println (month + " is out of range");
			}
		}catch(Exception e ){
			//error handling
			System.out.println ("Exception occured");
			e.printStackTrace();
		}
		
	}
}
