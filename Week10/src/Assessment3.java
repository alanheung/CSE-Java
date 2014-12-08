/**
 * @author A00226315
 */

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assessment3 {

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<PreOwnedCar> carList = new ArrayList<PreOwnedCar>();
	private static PreOwnedCar preOwnedCar;
	private final static String updateMake="M";
	private final static String updateModel="o";
	private final static String updateRegNo="R";
	private final static int MAX_FEATURES = 3;
	
	public static void main(String[] args) {
		int choice=0;
		while(choice!=7){
			choice=userChoice();
			switch (choice){
				case 1: add(carList); 				break;
				case 2: update(carList); 			break;
				case 3: deleteOneCar(carList); 		break;
				case 4: deleteAllCar(carList);	 	break;
				case 5: findCarByIndex(carList); 	break;
				case 6: display(carList);			break;
				case 7: System.out.println("Bye!"); break;
				default: 							break;
			}
		}

	}

	/**
	 * Displays a list of options and prompts user for a choice.
	 * @return int userChoice.
	 */
	public static int userChoice(){
		System.out.println("1 : Add a Car.");
		System.out.println("2 : Update a Car.");
		System.out.println("3 : Delete a Car.");
		System.out.println("4 : Delete all Cars.");
		System.out.println("5 : Find a Car.");
		System.out.println("6 : Display all Cars.");
		System.out.println("7 : Exit.");
		System.out.print("\nEnter your choice:");
		try{
			return sc.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Error :: You did not enter an Integer, please try again.");
			return 0;
		}
	}
	
	/**
	 * Adds a new preOwnedCar to carList if the reg is not already registered
	 * @param ArrayList<PreOwnedCar> carList
	 */
	public static void add(ArrayList<PreOwnedCar> carList){
		String make;
		String model;
		String regNo;
		try{
			System.out.print("Enter regNo:");
			regNo=sc.next();
			if(!carThereAlready(regNo,carList)){
				System.out.print("Enter make:");
				make=sc.next();
				System.out.print("Enter model:");
				model=sc.next();
				preOwnedCar = new PreOwnedCar(make,model,regNo);
				carList.add(preOwnedCar);
			}
			else{
				System.out.println("\n***Car RegNo already exists!***\n");
			}
		}catch (InputMismatchException e){
			System.out.println("Error :: You did not enter a String.");
		}
	}
	
	/**
	 * Prompts user car they wish to update.
	 * Prompts user for attribute they wish to update.
	 * @param ArrayList<PreOwnedCar> carList
	 */
	public static void update(ArrayList<PreOwnedCar> carList){
		int index;
		String make;
		String model;
		String regNo;
		String option;
		
		display(carList);
		System.out.print("Enter index of car:");
		try{
			index = sc.nextInt();
			try{
				preOwnedCar = carList.get(index);
				OuterLoop:
				for(int i=0;i<MAX_FEATURES;i++){
					System.out.print("Enter the change you wish to make, (M)ake, M(o)del, (R)egNo. Any other char to exit...");
					option=sc.next();
					switch(option){
						case updateMake:
							System.out.print("Enter new Make: ");
							make=sc.next();
							preOwnedCar.setMake(make);
							break;
						case updateModel:
							System.out.print("Enter new Model: ");
							model=sc.next();
							preOwnedCar.setModel(model);
							break;
						case updateRegNo:
							System.out.print("Enter new RegNo ");
							regNo=sc.next();
							preOwnedCar.setRegNo(regNo);
							break;
						default: break OuterLoop;
					}
				}
				System.out.println("\n Update carList :: ");
				display(carList);
			} catch(IndexOutOfBoundsException e){
				System.out.println("Error :: Index out of range!");
			}
			
		} catch (InputMismatchException e){
			System.out.println("Error :: You did not enter an Integer.");
		}
	}
	
	/**
	 * Prompts user for the car they wish to delete.
	 * @param ArrayList<PreOwnedCar> carList
	 */
	public static void deleteOneCar(ArrayList<PreOwnedCar> carList){
		boolean changeMade=false;
		String regNo;
		display(carList);
		System.out.print("Enter RegNo of car:");
		try{
			regNo = sc.next();
			for(PreOwnedCar car : carList){
				if(car.getRegNo().equals(regNo)){
					preOwnedCar=car;
					changeMade=true;
				}
			}
			if(changeMade){
				System.out.println("Car successfully removed..");
				carList.remove(preOwnedCar);
				display(carList);
			}
			else{
				System.out.println("Car does not exist in our system, no change made!");
			}
		} catch (InputMismatchException e){
			System.out.println("Error :: You did not enter a valid String.");
		}
	}
	
	/**
	 * Deletes all cars in carList.
	 * @param ArrayList<PreOwnedCar> carList
	 */
	public static void deleteAllCar(ArrayList<PreOwnedCar> carList){
		carList.removeAll(carList);
		display(carList);
	}
	
	/**
	 * Prompts user for an index and prints the car at that index.
	 * @param ArrayList<PreOwnedCar> carList
	 */
	public static void findCarByIndex(ArrayList<PreOwnedCar> carList){
		int index;
		System.out.print("Enter index of car:");
		try{
			index = sc.nextInt();
			System.out.println(carList.get(index));
		} catch (InputMismatchException e){
			System.out.println("Error :: You did not enter an Integer.");
		}
	}
	
	/**
	 * Prints all cars in carList.
	 * @param ArrayList<PreOwnedCar> carList
	 */
	public static void display(ArrayList<PreOwnedCar> carList){
		if(carList.size()>0){
			for(PreOwnedCar car : carList){
				System.out.println("\t"+car);
			}
		}
		else{
			System.out.println("\tCar list is empty!");
		}
	}
	
	/**
	 * Checks if the passed in regNo already exists.
	 * @param String regNo
	 * @param ArrayList<PreOwnedCar> carList
	 * @return true if regNo already exists.
	 */
	public static boolean carThereAlready(String regNo, ArrayList<PreOwnedCar> carList){
		for(PreOwnedCar car : carList){
			if(car.getRegNo().equals(regNo)){
				return true;
			}
		}
		return false;
	}
}

