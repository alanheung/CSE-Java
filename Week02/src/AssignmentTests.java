import java.util.Scanner;

//3. Write a program called AssignmentTests. Initialise x to 99. Write a ‘if’ statement
//that says “if(x=77)” what happens? Write an assignment statement as follows:
//“x==67” what happens?
//Start again and initialize x to 0. Take in an x value from the user. Evaluate x, if x
//is between 1 and 5 output the square of x; if x is between 5 and 10 output the cube
//of x; if x is less than 0 or greater than 10 then flag an error.
public class AssignmentTests {
	public static void main(String[] args) {
		// Declare variables
		int x = 0;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Please enter a value: ");
		x = sc.nextInt();
		//
		if (x<=5){
			System.out.println("The square value of " + x + " is " + (x = x*x));
		} else if (x>=5 && x<=10){
			System.out.println("The cubed value of " + x + " is " + (x = x*x*x));
		}else
			System.out.println("Sorry you have encountered an error");

	}

}
