import java.util.Scanner;

//2. Write a program called IfLogicalOps. Take in two integer values from the user; store in
//num1 and num2.
//Using one
//if
//statement, determine if
//a.Both numbers are negative
//b.Both numbers are positive
//c.One of the numbers is 0
//d.One of the numbers is negative
public class LogicalOps {
	public static void main(String[] args) {
		//Declare variables
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		//user inputs
		System.out.println ("Please enter your first number: ");
		num1 = sc.nextInt();
		System.out.println ("Please enter your second number: ");
		num2 = sc.nextInt();
		
		if (num1 < 1 && num2 < 1){
			System.out.println ("Both numbers are negative");
		}else if (num1 >= 1 && num2 >= 1){
			System.out.println ("Both numbers are positive");
		}else if (num1 == 0 || num2 == 0){
			System.out.println ("One of the numbers is 0");
		}else if (num1 < 0 || num2 < 0){
			System.out.println ("One of the numbers is negative");
		}
	}
}
