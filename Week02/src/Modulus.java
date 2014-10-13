import java.util.Scanner;

//4.Write a program called Modulus. Take in two integer values from the user; store in
//x and y. Using the modulus operator (%), determine if x is a multiple of y.
public class Modulus {
	public static void main(String[] args) {
		//Declare variables
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		//user inputs
		System.out.println ("Please enter your first number: ");
		num1 = sc.nextInt();
		System.out.println ("Please enter your second number: ");
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0) 
			System.out.println (num1 + " is a multiple of " + num2);
		else
			System.out.println (num1 + " is a not multiple of " + num2);


	}

}
