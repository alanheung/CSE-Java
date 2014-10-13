import java.util.Scanner;

//5. Write a program called Circle. Ask the user for the radius. Given the radius,
//calculate the diameter, circumference and the area (Google the formulae). Note
//that constants are declared with the keyword final
//preceding the type and the identifier is all capitals (good practice) i.e.
//final double PI = 3.14;
public class Circle {
	public static void main(String[] args) {
		// Declare variables
		int r = 0;
		int input = 0;
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Please enter a radius: ");
		r = sc.nextInt();
		
		// diameter 2 r
		System.out.println("The diamter is " + (2*r));
		// circumference 2 pie r 
		System.out.println("The circumference is " + (2*PI*r));
		// area = pie r 2
		System.out.println("The area is " + (PI*r*r));
	}

}
