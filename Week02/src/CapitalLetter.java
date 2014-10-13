import java.util.Scanner;

//4. Write a program called capital letter. Take in a letter from the user. If the letter is
//a capital letter output “Capital letter entered”; if a lowercase letter, output
//“Lowercase letter entered”; otherwise output an error (include the offending
//character in the error message).
public class CapitalLetter {
	public static void main(String[] args) {
		// Ask user for input
		Scanner sc = new Scanner(System.in);
		System.out.println ("Please enter a letter: ");
		char input = sc.next().charAt(0);
		
		//check if capital, lower case or invalid
		if(Character.isUpperCase(input)){
			System.out.println("You have entered a capital letter");
		}else if(Character.isLowerCase(input)){
				System.out.println("You have entered a lower case letter");
		}else{
			System.out.println("You have entered an invalid option");
		}
	}
}
