//1. Write a program called IncrementDecrement that examines pre- and post-increment and decrement. Declare
//two integer variables
//x
//and
//y
//. Initialise x to 5 and y to 10. Output the following to the screen in 8
//System.out.println statements.:
//Output x
//Output ++x
//Output x++
//Output x
//Write down why the output is the way it is.
//Output y
//Output --y
//Output y--
//Output y
//Write down why the output is the way it is
public class IncrementDecrement {
	public static void main(String[] args) {
		//Declare variables
		int x = 5;
		int y = 10;
		System.out.println("Output" + x);
		System.out.println("Output" + ++x);
		System.out.println("Output" + x++);
		System.out.println("Output" + x);
		System.out.println("Output" + y);
		System.out.println("Output" + --y);
		System.out.println("Output" + y--);
		System.out.println("Output" + y);
	}

}
