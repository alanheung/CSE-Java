import java.util.ArrayList;
import java.util.Scanner;

// Sean Kennedy
class PreOwnedCar{
	private String make, model, regNo;
	
	public PreOwnedCar() {
		make="";
		model="";
		regNo="";
	}

	public PreOwnedCar(String make, String model, String regNo) {
		this.make = make;
		this.model = model;
		this.regNo = regNo;
	}

	@Override
	public String toString() {
		return "PreOwnedCar [make=" + make + ", model=" + model + ", regNo="
				+ regNo + "]";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}	
}

public class Assessment4 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int ADD = 1, UPDATE=2, DELETE_ONE=3, DELETE_ALL=4, FIND_CAR_REG_NO=5, FIND_CAR_INDEX=6, DISPLAY=7, EXIT=8;
		final int ADD = 1, UPDATE=2, DELETE_ONE=3, DELETE_ALL=4, FIND_CAR_BY_INDEX=5, DISPLAY=6, EXIT=7;
		String userContinue="y";
		ArrayList<PreOwnedCar> preOwnedCars = new ArrayList<>(); // java 1.7
		// The AL must not have class scope or scope of all the methods i.e. declare it locally to main().
//		ArrayList<PreOwnedCar> preOwnedCars = new ArrayList<PreOwnedCar>();
		
		System.out.println("Second hand car program");
		while(userContinue.equalsIgnoreCase("y")){
			switch(userChoice()){
				case ADD: 		add(preOwnedCars);break;
				case UPDATE: 		update(preOwnedCars);break;
				case DELETE_ONE: 	deleteOneCar(preOwnedCars);break;
				case DELETE_ALL: 	deleteAllCars(preOwnedCars);break;
//				case FIND_CAR_REG_NO: 	findCarByRegNo(preOwnedCars);break;	

// method is coded below
				case FIND_CAR_BY_INDEX:	findCarByIndex(preOwnedCars);break;
				case DISPLAY: 		display(preOwnedCars);break;
				case EXIT: 		userContinue="n"; break;
				default: System.out.println("Unknown entry : "); break;
			}
		}
	}
	public static int userChoice() {
		System.out.println("What do you want to do ?");
		System.out.println("1. Add");
		System.out.println("2. Update");
		System.out.println("3. Delete a car");
		System.out.println("4. Delete all cars");
//		System.out.println("5. Find a car (by reg no) ");
		System.out.println("5. Find a car ");
		System.out.println("6. Display");
		System.out.println("7. Exit");
		return sc.nextInt();
	}
	
	public static void update(ArrayList<PreOwnedCar> carsAL) {
		final int MAX_FEATURES = 3;
		
		System.out.println("The cars list : "+carsAL);
		System.out.print("Enter the index of the car you wish to update --> ");
		int index = sc.nextInt();

		// Get the current car from the AL
		try{
			PreOwnedCar car = carsAL.get(index);
			// Now get the detail(s) to be changed
			exitForLoop:
			for(int i=1; i<=MAX_FEATURES; i++){
				System.out.print("Enter the feature you to update: (M)ake M(o)del (R)eg. Any other char to exit... --> ");
				String feature = sc.next().toUpperCase();
				switch(feature){
					case "M":
						System.out.print("Enter the new make --> ");
						car.setMake(sc.next());
						break;
					case "O":
						System.out.print("Enter the new model --> ");
						car.setModel(sc.next());
						break;
					case "R":
						System.out.print("Enter the new reg number --> ");
						car.setRegNo(sc.next());
						break;
					default:
						break exitForLoop; // finished
				}
				
			}
                        // maybe this is unecessary - I get a refernec to it and therefore
                        // any changes using that ref affect the AL - it works!
			//carsAL.set(index, car);	// update AL at specific index with updated car.
			System.out.println("The updated cars list : "+carsAL);
			
		} catch(IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException caught..."); // don't print the stack trace
		}
		
	}
	public static void deleteOneCar(ArrayList<PreOwnedCar> carsAL) {
		System.out.println("The cars list before : "+carsAL);
		
		System.out.print("Enter the reg number --> ");
		String carRegNo = sc.next();
		boolean carDeleted=false;
		for(int i=0; i<carsAL.size(); i++){
			PreOwnedCar car = carsAL.get(i);
			if(car.getRegNo().equalsIgnoreCase(carRegNo)){
				carsAL.remove(car); // OR carsAL.remove(i);
				carDeleted=true;
                                break; // exit loop
			}
		}
		if(carDeleted)
			System.out.println("Deleted car...");
		else
			System.out.println("Could not find that reg number so could not delete that car!");
		
		System.out.println("The cars list after : "+carsAL);
	}
	public static void deleteAllCars(ArrayList<PreOwnedCar> carsAL) {
		carsAL.clear();
		if(carsAL.isEmpty()){
			System.out.println("The array list is blank");
		}
	}
	public static void findCarByIndex(ArrayList<PreOwnedCar> carsAL) {
		System.out.print("Enter the index --> ");
		int index = sc.nextInt();
		if(index < 0 || index >= carsAL.size()){
			System.out.println("The index is out of bounds : "+index);
		}else{
			// index ok
			PreOwnedCar car = carsAL.get(index);
			System.out.println(car);
		}
	}
	public static void add(ArrayList<PreOwnedCar> carsAL) {
		// Get the reg number
		System.out.print("Enter the reg number --> ");
		String carRegNo = sc.next();

		// If the car reg no is not in AL then add car
		if(carThereAlready(carRegNo, carsAL)){
			System.out.println("The car with reg no "+carRegNo+" is already in the list...");
		}else{
			System.out.print("Enter the make --> ");
			String carMake = sc.next();
			System.out.print("Enter the model --> ");
			String carModel = sc.next();
			PreOwnedCar car = new PreOwnedCar(carMake, carModel, carRegNo);
			carsAL.add(car);
		}
	}

	public static boolean carThereAlready(String carRegNo, ArrayList<PreOwnedCar> carsAL) {
		boolean carThere = false;
		for(PreOwnedCar car:carsAL){
			if(car.getRegNo().equalsIgnoreCase(carRegNo)){
				// car there already
				carThere = true;
				break;
			}
		}			
		return carThere;
	}

	public static void display(ArrayList<PreOwnedCar> carsAL) {
//		System.out.println("The cars list : "+carsAL);
		for(PreOwnedCar car:carsAL){
			System.out.println(car);
		}
		
		// Convert to an array
		// See http://viralpatel.net/blogs/convert-arraylist-to-arrays-in-java/
//		PreOwnedCar[] carArray = carsAL.toArray(new PreOwnedCar[carsAL.size()]);
//		for(int i=0; i<carArray.length; i++){
//			System.out.println("PreOwnedCar ["+i+"] is "+carArray[i]);
//		}
	}
	
}
