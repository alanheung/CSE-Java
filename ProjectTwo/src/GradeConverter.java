import java.util.Scanner;

public class GradeConverter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the grade converter");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		// Perform conversions until choice is no longer equal to y 
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")){
			//	Get the numerical grade from user
			System.out.println("Please enter the grade ");
			int grade = sc.nextInt();
			
			// Convert the numerical grade to a lettered grade eg. A, B, C....
			String letterGrade = "";
			if(grade >= 88){
				letterGrade = "A";
			}
			else if(grade >= 80){
				letterGrade = "B";
			}
			else if(grade >= 67){
				letterGrade = "C";
			}
			else if(grade >= 60){
				letterGrade = "D";
			}
			else{
				letterGrade = "F";
			}
			
			// Display results
			System.out.println("Your grade is " + letterGrade);
			System.out.println();

			// see if the user wishes to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("The End");

	}

}
