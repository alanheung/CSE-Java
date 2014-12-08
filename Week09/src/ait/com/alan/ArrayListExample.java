package ait.com.alan;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> destinations = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Holiday destination program");

		final int ADD=1, UPDATE= 2, DELETE=3, DISPLAY=4, EXIT=5;
		String userContinue ="y";

		while(userContinue.equalsIgnoreCase("y")){
			switch(userChoice()){
			case ADD:
				destinations.add(add());
				break;
			case UPDATE:
				update(destinations);
				break;
			case DELETE:
				delete(destinations);
				break;
			case DISPLAY:
				display(destinations);
				break;
			case EXIT: 
				userContinue="n";
				break;
			default:
				System.out.println("unknown entry");
			}
		}
	}
	public static int userChoice(){//user choice
		System.out.print("\nWhat do you want to do?");
		System.out.print("\n1.add \n2.update \n3.delete \n4.display \n5.Exit");
		int input = sc.nextInt();
		return input;
	}
	public static String add(){//add
		System.out.print("Enter destination");
		String input = sc.next();
		return input;
	}
	public static void update(ArrayList<String> destinations){//update
		int index;
		System.out.println("The  current destinations "+destinations);
		System.out.print("Which index do you wish to update?");
		index = sc.nextInt();
		System.out.print("Enter destination to add:");
		String dest = sc.next();
		destinations.set(index, dest);
		System.out.println("The destinations are now "+destinations);
	}
	public static void delete(ArrayList<String> destinations){//delete
		int index;
		System.out.println("The  current destinations "+destinations);
		System.out.print("Which index do you wish to delete?");
		index = sc.nextInt();
		destinations.remove(index);
		System.out.println("The destinations are now "+destinations);
	}
	public static void display(ArrayList<String> destinations){//display
		System.out.print("The destinations are: ");
		for(String element: destinations){
			System.out.println("The destinations: "+element);
		}
	}

}//end
