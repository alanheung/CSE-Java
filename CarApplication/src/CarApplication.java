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
		return "preOwnedCar [make=" + make + ", model=" + model + ", regNo="
				+ regNo + "]";
	}	
}
public class CarApplication {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		final int ADD=1,
				UPDATE=2,
				DELETE=3,
				DELETE_ALL=4,
				FIND_CAR_REG_NO=5,
				FIND_CAR_INDEX=6,
				DISPLAY=7,
				EXIT=8;
		String userContinue="y";
		ArrayList<PreOwnedCar> preOwnedCars = new ArrayList<>();

		while(userContinue.equalsIgnoreCase("y")){
			switch(userChoice()){
			case ADD: 	add(preOwnedCars);
				break;
			case UPDATE: 	update(preOwnedCars);
				break;
			case DELETE: deleteOneCar(preOwnedCars);
				break;
			case DISPLAY: display(preOwnedCars);
				break;
			case DELETE_ALL: deleteAllCar(preOwnedCars);
				break;
			case FIND_CAR_REG_NO: findCarByRegNo(preOwnedCars);
				break;
			case FIND_CAR_INDEX: findCarByIndex(preOwnedCars);
				break;	
			case EXIT: userContinue="n";
				break;
			}
		}//end while
	}//end main
	
	public static int userChoice(){
		System.out.print("1. Add \n2. Update \n3. Delete car \n4. Delete all cars " +
				"\n5. Find car with registration no. \n6. Find car with index " +
				"\n7. Display \n8. Exit ");
		System.out.print("Select an option: ");
		return sc.nextInt();
	}
	
	public static void add(ArrayList<PreOwnedCar> carList){//1
		System.out.print("Enter the registration no.: ");
		String carRegNo = sc.next();
		boolean exists =false;
		for(PreOwnedCar car:carList){
			if(car.getRegNo().equalsIgnoreCase(carRegNo)){
				System.out.println("Car exists in the car list: ");
				exists = true;
				break;
			}
		}
		
		if(!exists){
			System.out.print("Enter make: ");
			String make = sc.next();
			System.out.print("Enter model: ");
			String model = sc.next();
			PreOwnedCar car = new PreOwnedCar(make, model, carRegNo);
			carList.add(car);
		}
	}
	
	public static void update(ArrayList<PreOwnedCar> carList){//2
		System.out.println("Cars before: "+carList);
		System.out.print("Enter the index: ");
		int index = sc.nextInt();

		//retrieve cars from the array list
		try{
			PreOwnedCar car = carList.get(index);
			boolean askAgain=true;
			while(askAgain){
				System.out.print("Enter option you want to update:(Make(M), Model(O), Registration No.(R), Exit(Any key) ");
				String input = sc.next().toUpperCase();
				switch(input){
				case "M": 	System.out.print("Enter make: "); car.setMake(sc.next());
					break;
				case "O": 	System.out.print("Enter model: "); car.setModel(sc.next());
					break;
				case "R": 	System.out.print("Enter registration no.: "); car.setRegNo(sc.next());
					break;
				default:
					askAgain=false;
				}
			}
			carList.set(index,car);
			System.out.println("The updated list: "+carList);

		}catch(IndexOutOfBoundsException e){
			System.out.print(e);
		}
	}
	
	public static void deleteOneCar(ArrayList<PreOwnedCar> carList){//3
		System.out.println("Cars before: "+carList);
		
		System.out.print("Enter the registration no.: ");
		String carRegNo = sc.next();
		boolean carDeleted=false;
		for(int i=0; i<carList.size(); i++){
			PreOwnedCar car = carList.get(i);
			if(car.getRegNo().equalsIgnoreCase(carRegNo)){
				carList.remove(car);
				carDeleted=true;
			}
		}
		if(carDeleted){
			System.out.println("Deleted car: ");
		}else{
			System.out.println("Could not find registration no.: ");
		}
		System.out.println("Cars after: "+carList);
	}
	
	public static void deleteAllCar(ArrayList<PreOwnedCar> carList){//4
		carList.clear();
		if(carList.isEmpty()){
			System.out.println("The car list is empty ");
		}
	}

	
	public static void display(ArrayList<PreOwnedCar> carList){//5
		for(PreOwnedCar car:carList){
			System.out.println(car);
		}
	}
	
	public static void findCarByRegNo(ArrayList<PreOwnedCar> carList){//6
		System.out.print("Enter registration no.: ");
		String carRegNo = sc.next();
		boolean carFound=false;
		for(PreOwnedCar car:carList){
			if(car.getRegNo().equalsIgnoreCase(carRegNo)){
				carFound=true;
				break;
			}
		}
		if(carFound){
			System.out.println("Car found");
		}else{
			System.out.println("Car not found");

		}

	}
	public static void findCarByIndex(ArrayList<PreOwnedCar> carList){//7
		System.out.print("Enter index: ");
		int index = sc.nextInt();
		if(index <0 || index >=carList.size()){
			System.out.println("The index is out of range");
		}else{
			PreOwnedCar car = carList.get(index);
			System.out.println(car);
		}
	}
		
}//end class

