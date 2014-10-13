import java.util.Scanner;

public class AreaAndPerimeter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the area and perimeter calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		// Perform invoice calculations until the choice is not equal to lower case y or uppercase y
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")){
			// get the input from the user
			System.out.println("Please enter the length ");
			double length = 0.0;
			length = sc.nextDouble();
			
			System.out.println("Please enter the width ");
			double width = 0.0;
			width = sc.nextDouble();
			
			//Calculate the area and perimeter
			double area = length * width;
			double perimeter = (2 * length) + (2 * width);
			
			//display the results
			System.out.println("The area is " + area);
			System.out.println("The perimeter is " + perimeter);
			System.out.println();	
			
			// see if the user wishes to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}	
		System.out.println("Finished");

		
	}

}
