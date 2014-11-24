import java.util.ArrayList;
import java.util.Scanner;

class PreOwnedCar{
	private String make, model, regNo;

	public PreOwnedCar(String make, String model, String regNo) {
		super();
		this.make = make;
		this.model = model;
		this.regNo = regNo;
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

	@Override
	public String toString() {
		return "PreOwnedCar [make=" + make + ", model=" + model + ", regNo="
				+ regNo + "]";
	}

}
public class CarApplication2{
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ADD=1, UPDATE=2, DELETE_ONE=3, DELETE_ALL=4,
				FIND_CAR_REG_NO=5, FIND_CAR_INDEX=6, DISPLAY=7, EXIT=8;
		String userContinue="y";
		ArrayList<PreOwnedCar> preOwnedCars =
				new ArrayList<>();
				System.out.println("Second hand car program");
				while(userContinue.equalsIgnoreCase("y")){
					switch(userChoice()){
					case ADD:				add(preOwnedCars);
					break;
					case UPDATE:			update(preOwnedCars);
					break;
					case DELETE_ONE:		deleteOneCar(preOwnedCars);
					break;
					case DELETE_ALL:		deleteAllCars(preOwnedCars);
					break;
					case FIND_CAR_REG_NO:	findCarByRegNo(preOwnedCars);
					break;
					case FIND_CAR_INDEX:	findCarByIndex(preOwnedCars);
					break;
					case DISPLAY:			display(preOwnedCars);
					break;
					case EXIT:				userContinue="n";
					break;
					}
				}
	}
	
	public static int userChoice(){
		System.out.println("What do you want to try?");
		System.out.println("1. Add");
		System.out.println("2. Update");
		System.out.println("3. Delete a car");
		System.out.println("4. Delete all cars");
		System.out.println("5. Find a car by reg no");
		System.out.println("6. Find a car by index");
		System.out.println("7. Display");
		System.out.println("8. Exit");
		return sc.nextInt();
	}
	
	public static void update(ArrayList<PreOwnedCar> carsAL){
		final int MAX_FEATURES=3;

		System.out.println("Cars before == "+carsAL);
		System.out.print("Enter the index: ");
		int index=sc.nextInt();

		// get that car from the AL
		try{
			PreOwnedCar car = carsAL.get(index);
			exitForLoop:
				for(int i=1; i<=MAX_FEATURES; i++){
					System.out.print("Enter feature you wish to update: (M)ake M(o)del (R)eg  Any other char to exit... ");
					String feature = sc.next().toUpperCase();
					switch(feature){
					case "M":
						System.out.print("Enter the new make: ");
						car.setMake(sc.next());
						break;
					case "O":
						System.out.print("Enter the new model: ");
						car.setModel(sc.next());
						break;
					case "R":
						System.out.print("Enter the new reg: ");
						car.setRegNo(sc.next());
						break;
					default:
						break exitForLoop;
					}
				}
			carsAL.set(index, car);
			System.out.println("The updated list == "+carsAL);

		}catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}

	}
	
	public static void deleteOneCar(ArrayList<PreOwnedCar> carsAL){
		System.out.println("Cars before == "+carsAL);

		System.out.print("Enter the reg no: ");
		String carRegNo = sc.next();
		boolean carDeleted=false;
		for(int i=0; i<carsAL.size(); i++){
			PreOwnedCar car = carsAL.get(i);
			if(car.getRegNo().equalsIgnoreCase(carRegNo)){
				carsAL.remove(car);
				carDeleted = true;
			}
		}
		if(carDeleted)
			System.out.println("Deleted car...");
		else
			System.out.println("Could not find reg no to delete the car..");

		System.out.println("Cars after == "+carsAL);

	}
	
	public static void display(ArrayList<PreOwnedCar> carsAL){
		for(PreOwnedCar car:carsAL)
			System.out.println(car);
	}
	
	public static void findCarByRegNo(ArrayList<PreOwnedCar> carsAL){
		System.out.print("Enter the reg no: ");
		String carRegNo = sc.next();
		boolean carFound=false;
		for(PreOwnedCar car:carsAL){
			if(car.getRegNo().equalsIgnoreCase(carRegNo)){
				carFound=true;
				break;
			}
		}
		if(carFound){
			System.out.println("Found car!");
		}else{
			System.out.println("Did not find car!");
		}

	}
	
	public static void findCarByIndex(ArrayList<PreOwnedCar> carsAL){
		System.out.print("Enter the index: ");
		int index=sc.nextInt();
		if(index < 0 || index >= carsAL.size()){
			System.out.println("Index is out of bounds...");
		}else{
			// index is ok
			PreOwnedCar car = carsAL.get(index);
			System.out.println(car);
		}
	}
	
	public static void deleteAllCars(ArrayList<PreOwnedCar> carsAL){
		carsAL.clear();
		if(carsAL.isEmpty()){
			System.out.println("AL is empty...");
		}
	}

	public static void add(ArrayList<PreOwnedCar> carsAL){
		// make sure that the car is not already in the AL
		System.out.print("Enter the reg no: ");
		String carRegNo = sc.next();
		boolean thereAlready=false;
		for(PreOwnedCar car:carsAL){
			if(car.getRegNo().equalsIgnoreCase(carRegNo)){
				System.out.println("Car already in AL...");
				thereAlready=true;
				break;
			}
		}

		// if the car reg is not in the AL then add the car
		if(!thereAlready){
			System.out.println("Enter make: ");
			String make = sc.next();
			System.out.println("Enter model: ");
			String model = sc.next();
			PreOwnedCar car = new PreOwnedCar(make, model, carRegNo);
			carsAL.add(car);
		}
	}
}
