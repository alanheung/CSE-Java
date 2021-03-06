
public class Person {
	private String name;
	private String address;
	private boolean drinkDrivingOffense;
	private boolean caughtWithoutASeatbelt;
	private boolean dangerousOvertaking;
	private boolean usingMobileWhileDriving;
	private boolean drivingDefectiveVehicle;
	private boolean crossingContinuosWhiteLine;
	private Car car;
	private int totalPenaltyPoints;
	
	public Person(String name, String address, Car car) {
		this.name = name;
		this.address = address;
		this.car = car;
	}
	public Person(String name, String address, boolean drinkDrivingOffense, boolean caughtWithoutASeatbelt, boolean dangerousOvertaking,
			boolean usingMobileWhileDriving, boolean drivingDefectiveVehicle, boolean crossingContinuosWhiteLine, Car car) {
		this.name = name;
		this.address = address;
		this.drinkDrivingOffense = drinkDrivingOffense;
		this.caughtWithoutASeatbelt = caughtWithoutASeatbelt;
		this.dangerousOvertaking = dangerousOvertaking;
		this.usingMobileWhileDriving = usingMobileWhileDriving;
		this.drivingDefectiveVehicle = drivingDefectiveVehicle;
		this.crossingContinuosWhiteLine = crossingContinuosWhiteLine;
		this.car = car;
	}
	public void calculatePenaltyPoints() {
		int total=0;
		if(drinkDrivingOffense == true){
			total += 5;
		}if(caughtWithoutASeatbelt == true){
			total += 5;
		}if(dangerousOvertaking == true){
			total += 5;
		}if(usingMobileWhileDriving == true){
			total += 4;
		}if(drivingDefectiveVehicle == true){
			total += 5;
		}if(crossingContinuosWhiteLine == true){
			total += 4;
		}
		setTotalPenaltyPoints(total);
	}
	public boolean isDisqualified() {
		final int DISQUALIFIED_MIN = 12;
		if(getTotalPenaltyPoints() > DISQUALIFIED_MIN){
			return true;
		}else{
			return false;
		}	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isDrinkDrivingOffense() {
		return drinkDrivingOffense;
	}
	public void setDrinkDrivingOffense(boolean drinkDrivingOffense) {
		this.drinkDrivingOffense = drinkDrivingOffense;
	}
	public boolean isCaughtWithoutASeatbelt() {
		return caughtWithoutASeatbelt;
	}
	public void setCaughtWithoutASeatbelt(boolean caughtWithoutASeatbelt) {
		this.caughtWithoutASeatbelt = caughtWithoutASeatbelt;
	}
	public boolean isDangerousOvertaking() {
		return dangerousOvertaking;
	}
	public void setDangerousOvertaking(boolean dangerousOvertaking) {
		this.dangerousOvertaking = dangerousOvertaking;
	}
	public boolean isUsingMobileWhileDriving() {
		return usingMobileWhileDriving;
	}
	public void setUsingMobileWhileDriving(boolean usingMobileWhileDriving) {
		this.usingMobileWhileDriving = usingMobileWhileDriving;
	}
	public boolean isDrivingDefectiveVehicle() {
		return drivingDefectiveVehicle;
	}
	public void setDrivingDefectiveVehicle(boolean drivingDefectiveVehicle) {
		this.drivingDefectiveVehicle = drivingDefectiveVehicle;
	}
	public boolean isCrossingContinuosWhiteLine() {
		return crossingContinuosWhiteLine;
	}
	public void setCrossingContinuosWhiteLine(boolean crossingContinuosWhiteLine) {
		this.crossingContinuosWhiteLine = crossingContinuosWhiteLine;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public int getTotalPenaltyPoints() {
		return totalPenaltyPoints;
	}
	public void setTotalPenaltyPoints(int totalPenaltyPoints) {
		this.totalPenaltyPoints = totalPenaltyPoints;
	}
	@Override
	public String toString(){
		return 	"name = "+name+
		"\naddress = "+address+
		"\ndrinkDrivingOffense = "+drinkDrivingOffense+
		"\ncaughtWithoutASeatbelt = "+caughtWithoutASeatbelt+
		"\ndangerousOvertaking = "+dangerousOvertaking+
		"\nusingMobileWhileDriving = "+usingMobileWhileDriving+
		"\ndrivingDefectiveVehicle = "+drivingDefectiveVehicle+
		"\ncrossingContinuosWhiteLine = "+crossingContinuosWhiteLine+
		"\ncar = "+car+
		"\npenalty points = "+totalPenaltyPoints;
	}
	
}//
