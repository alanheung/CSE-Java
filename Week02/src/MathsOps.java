import java.util.Scanner;

//Write a program called MathsOps. Take in two integer values from the user; store in num1
//and num2. Using “good” variable names/indentation, calculate the sum, product, 
//difference and quotient of the two numbers.
//Output your results. In the format: The sum of 3 and 5 is 8 (assuming 3 and 5 are typed in). 
//Ensure that you
//do not divide by 0 (as this will cause an exception i.e. a runtime error).
public class MathsOps {
	public static void main(String[] args) {
		//Declare variables
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		//user inputs
		System.out.println ("Please enter your first number: ");
		num1 = sc.nextInt();
		System.out.println ("Please enter your second number: ");
		num2 = sc.nextInt();
		if(num1 != 0 && num2 != 0){
		//sum
		System.out.println ("The sum of "+ num1 +" and "+ num2 + " is " + (num1+num2));
		//product
		System.out.println ("The product of "+ num1 +" and "+ num2 + " is " + (num1*num2));
		//difference
		System.out.println ("The difference of "+ num1 +" and "+ num2 + " is " + (Math.abs(num1-num2)));
		//quotient
		System.out.println ("The quotient of "+ num1 +" and "+ num2 + " is " + (num1%num2));
		}else
			System.out.println ("You have entered zero");

	}

}
