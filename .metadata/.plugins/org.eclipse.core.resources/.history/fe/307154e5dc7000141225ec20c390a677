import java.util.ArrayList;
import java.util.Scanner;

public class searchBean {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		// create an empty array list with an initial capacity
		ArrayList<String> arrlist = new ArrayList<String>();

		// use add() method to add elements in the list
		arrlist.add("Milk");
		arrlist.add("Butter");
		arrlist.add("Cheese");

		// let us print all the elements available in list
		for (String element : arrlist) {
			System.out.println("Products = " + element);
		}

		System.out.print("Please enter search criteria: ");
		String input = sc.next();
		if (input.equalsIgnoreCase(arrlist.get(0))) {
			System.out.println("Display milk");
		}else if(input.equalsIgnoreCase(arrlist.get(1))){
			System.out.println("Display butter");
		}else if(input.equalsIgnoreCase(arrlist.get(2))){
			System.out.println("Display cheese");
		}else{
			System.out.println("Sorry search criteria is not listed");
		}

	}

}


