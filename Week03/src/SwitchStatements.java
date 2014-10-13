//1. create method switchOnAString. In method read in a name from the user. 
//Using switch construct determine if the name entered is john or mary. 
//If John- Male, if Mary- female invoke method from main expand to include JOHN john MARY mary
//2. create a method switchMonth read a number and display the month, change app to use constants
//3. create method switchChar. read 2 numbers num1 num2 and a character(operation). 
//Using a switch perform the mathematical operation if"+" num1 and num2 output result 
//should only be one output
//4.create a method called switchSquareOrCube read in a num within 1-10 using switch 
//if number is even output the square, vice versa cubed
// create method switchVowelOrConsonant take letter in from user using switch determine 
//if it is a vowel or consonant
//switchDaysInMonth ask user for a year and a month calc no of days in the month and output the results
//need to calc for february leap year
import java.util.Scanner;
public class SwitchStatements {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//switchOnAString();
		//switchMonth();
		//switchChar();
		//switchSquareOrCube();
		//switchVowelOrConsonant();
		switchDaysInMonth();
	}
	public static void switchDaysInMonth(){
		System.out.print("Please enter a year: ");
		int year = sc.nextInt();
		System.out.print("Please enter a month(1-12): ");
		int month = sc.nextInt();
		int days=0;
		final int JAN = 1;
		final int FEB = 2;
		final int MAR = 3;
		final int APR = 4;
		final int MAY = 5;
		final int JUN = 6;
		final int JUL = 7;
		final int AUG = 8;
		final int SEP = 9;
		final int OCT = 10;
		final int NOV = 11;
		final int DEC = 12;
		//boolean isLeapYear =( (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0) );

		switch(month){
			case JAN: case MAR: case MAY: case JUL: case AUG: case OCT: case DEC: days = 31;
				break;			
			case FEB:
				if ( (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0) ){//(isLeapYear){
					days = 29;//this is a leap year
				}else{
					days = 28;//not a leap year
				}
				break;
			case APR:case JUN: case SEP: case NOV: days = 30;
				break;
			default: 
				System.out.println("Invalid month "+month);		
				break;
		}
		System.out.println("The days in month "+month+" in the year "+year +" is "+ days);		
	}
	
	public static void switchVowelOrConsonant(){
		System.out.print("Please enter a letter from a-z: ");
		char c = sc.next().toLowerCase().charAt(0);
		if(c>'a' && c<'z'){
			switch(c){
				case 'a':case 'e':case 'i':case 'o':case 'u':
					System.out.println(c+" is a vowel");
					break;
				default: 
					System.out.println(c+" is a consonant");
					break;
			}
		}else{
			System.out.println("Exception in the input!");		
		}
	}
	
	public static void switchSquareOrCube(){
		System.out.print("Please enter a number between 1-10: ");
		int n = sc.nextInt();
		try{
				switch(n){
					case 2:case 4:case 6:case 8:case 10:
						System.out.println(n+" squared is "+(n*n));
						break;
					case 1:case 3:case 5:case 7:case 9:
						System.out.println(n+" cubed is "+(n*n*n));
						break;
		//			case >=1: case <=10: case %2==0: System.out.println(n+" squared is "+(n*n));
		//				break;
		//			case >=1: case <=10: case %2!=0: System.out.println(n+" cubed is "+(n*n*n));
		//				break;
					default: System.out.println("the number is outside range");
						break;
				}
		}catch(Exception e){
			System.out.println("Exception in the input!");
			e.printStackTrace();
		}
	}
	public static void switchChar(){
		boolean charOK = true;
		System.out.print("Please enter num1: ");
		//Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Please enter num2: ");
		int num2 = sc.nextInt();
		System.out.print("Please enter a character: ");
		char c = sc.next().charAt(0);
		int ans=0;
		
		switch(c){
			case '+' : ans = num1+num2;
				break;
			case '-' : ans = num1-num2;
				break;			
			case '/' : ans = num1/num2;
				break;			
			case '*' : ans = num1*num2;
				break;
			case '%' : ans = num1%num2;
				break;
			default: System.out.println("invalid operator");
				charOK=false;
				break;
		}
		if(charOK){
			System.out.println(num1 +" "+ c +" "+num2 +" = "+ans);
		}
	}
	
	public static void switchMonth(){
		System.out.print("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		final int JAN = 1;
		final int FEB = 2;
		final int MAR = 3;
		final int APR = 4;
		final int MAY = 5;
		final int JUN = 6;
		final int JUL = 7;
		final int AUG = 8;
		final int SEP = 9;
		final int OCT = 10;
		final int NOV = 11;
		final int DEC = 12;
		
		switch(month){
			case JAN : System.out.println("January");
				break;
			case FEB : System.out.println("February");
				break;
			case MAR : System.out.println("March");
				break;
			case APR : System.out.println("April");
				break;
			case MAY : System.out.println("May");
				break;
			case JUN : System.out.println("June");
				break;
			case JUL : System.out.println("July");
				break;
			case AUG : System.out.println("August");
				break;
			case SEP : System.out.println("September");
				break;
			case OCT : System.out.println("October");
				break;
			case NOV : System.out.println("November");
				break;
			case DEC : System.out.println("December");
				break;
			default: System.out.println("Not valid");
				break;
		}
	}
	
	public static void switchOnAString(){
		System.out.print("Please enter name: ");
		Scanner sc = new Scanner(System.in);
//		String name = sc.next.toLowerCase(); //lowercase only
		String name = sc.next();
		
		switch(name){
//			default: System.out.println("You have entered an invalid name");
//				break;// this still works
			case "john": case "JOHN": case "John": System.out.println("Male");
				break;//if you remove the break it displays Male, Female
			case "mary": case "MARY" : case "Mary" : System.out.println("Female");
				break;
			default: System.out.println("You have entered an invalid name");
				break;
		}
	}
}
