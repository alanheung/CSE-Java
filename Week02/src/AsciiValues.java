import java.util.Scanner;

//1.Write a program called AsciiValues that loops until the user types in “x”. For
//each character input, output its numeric Ascii value (Google the Ascii table for
//these values). For example, ‘A’ outputs 65.
public class AsciiValues {
	public static void main(String[] args) {
		System.out.println("Welcome to the Ascii Values Converter app. Press any key and enter to start ");
		
		//declare variables
		Scanner sc = new Scanner(System.in);

		for ( int i = 0; i < sc.next().length(); ++i ){
			System.out.println ("Please enter a letter: ");
			char c = sc.next().charAt(i);
			int j = (int) c;
			System.out.println("ASCII OF "+c +" = " + j + ".");
		}
		
//			//Display the numeric Ascii value
//			char firstChar = sc.next().charAt(0);
//			System.out.println (firstChar);
//			//String s ="11";
	}
}
