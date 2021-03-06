// Alan Heung A00226316
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int num = 0;
	        System.out.print("Enter a three digit number: ");
	        try {
	            num = sc.nextInt();
	        } catch (Exception e) {
	        	System.out.println("Invalid input!");
	        }

	        if (num < 100 || num > 999) {
	        	System.out.println("Invalid input!");
	        }

	        boolean allOdd = true;
	        boolean allEven = true;

	        while (num > 0) {
	            int leastSigDigit = num % 10;
	            if (leastSigDigit % 2 == 0) {
	                allOdd = false;
	            } else {
	                allEven = false;
	            }
	            num /= 10;
	        }

	        if (allOdd) {
	            System.out.println("Your number has all odd digits.");
	        } else if (allEven) {
	            System.out.println("Your number has all even digits.");
	        } else {
	            System.out.println("Your number has both even and odd digits.");
	        }
	}
}
