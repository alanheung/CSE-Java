// Alan Heung A00226316
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Please enter first number: ");
		 int num1 = sc.nextInt();	
		 System.out.print("Please enter second number: ");
		 int num2 = sc.nextInt();
		 boolean c;
		 if(num1 > num2){
			 c = true;
			 System.out.print(num1 + " is greater than "+ num2 +" "+ c);
		 }else{
			 c = false;
			 System.out.print(num1 + " is greater than "+ num2 +" "+ c);
		 }
			 
	}

}
