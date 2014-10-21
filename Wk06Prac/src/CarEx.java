
public class CarEx {

	public static void main(String[] args) {
		Car ford = new Car("159573", "Ford", 1);
		Person alan = new Person("Alan","Galway",true, true,false, true,false, true, ford);
		System.out.println(alan);
		
		alan.calculatePenaltyPoints();
		System.out.println(alan.getName() + " has "+alan.getTotalPenaltyPoints()+ " points");
		
		alan.setDrivingDefectiveVehicle(true);
		alan.calculatePenaltyPoints();
		System.out.println(alan.getName() + " has "+alan.getTotalPenaltyPoints()+ " points");
		
		if(alan.isDisqualified())
			System.out.println(alan.getName() + " is disqualified ");
		else
			System.out.println(alan.getName() + " is not disqualified ");

		// Joe Civil
		Car volvo = new Car("S40", "Volvo", 4);
		Person alanCivil = new Person("Alan Civil","Vine Valley",volvo);
		System.out.println(alanCivil);
		
		alanCivil.calculatePenaltyPoints();
		System.out.println(alanCivil.getName() + " has "+alanCivil.getTotalPenaltyPoints()+ " points");
		
	
	
	}

}
