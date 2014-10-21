
class Person {
	private String name, address;
	private boolean drinkDrivingOffence, caughtWithoutASeatbelt;
	private boolean dangerousOvertaking, usingMobileWhileDriving;
	private boolean drivingDefectiveVehicle, crossingContinuousWhiteline;
	private Car car;
	private int totalPenaltyPoints;
	
	public Person(String name, String address, Car car) {
		this.name = name;
		this.address = address;
		this.car = car;
	}
	public Person(String name, String address, 
			boolean drinkDrivingOffence,
			boolean caughtWithoutASeatbelt, 
			boolean dangerousOvertaking,
			boolean usingMobileWhileDriving, 
			boolean drivingDefectiveVehicle,
			boolean crossingContinuousWhiteline, 
			Car car) {
		this.name = name;
		this.address = address;
		this.drinkDrivingOffence = drinkDrivingOffence;
		this.caughtWithoutASeatbelt = caughtWithoutASeatbelt;
		this.dangerousOvertaking = dangerousOvertaking;
		this.usingMobileWhileDriving = usingMobileWhileDriving;
		this.drivingDefectiveVehicle = drivingDefectiveVehicle;
		this.crossingContinuousWhiteline = crossingContinuousWhiteline;
		this.car = car;
	}
	
	public int getTotalPenaltyPoints(){
		return totalPenaltyPoints;
	}
	public void setTotalPenaltyPoints(int aTotalPenaltyPoints){
		totalPenaltyPoints = aTotalPenaltyPoints;		
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
	public boolean isDrinkDrivingOffence() {
		return drinkDrivingOffence;
	}
	public void setDrinkDrivingOffence(boolean drinkDrivingOffence) {
		this.drinkDrivingOffence = drinkDrivingOffence;
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
	public boolean isCrossingContinuousWhiteline() {
		return crossingContinuousWhiteline;
	}
	public void setCrossingContinuousWhiteline(boolean crossingContinuousWhiteline) {
		this.crossingContinuousWhiteline = crossingContinuousWhiteline;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address
				+ ", drinkDrivingOffence=" + drinkDrivingOffence
				+ ", caughtWithoutASeatbelt=" + caughtWithoutASeatbelt
				+ ", dangerousOvertaking=" + dangerousOvertaking
				+ ", usingMobileWhileDriving=" + usingMobileWhileDriving
				+ ", drivingDefectiveVehicle=" + drivingDefectiveVehicle
				+ ", crossingContinuousWhiteline="
				+ crossingContinuousWhiteline + ", car=" + car
				+ ", totalPenaltyPoints=" + totalPenaltyPoints + "]";
	}

//	public void calculatePenaltyPoints(){
//		if(drinkDrivingOffence)
//			totalPenaltyPoints+=5;
//		if(caughtWithoutASeatbelt)
//			totalPenaltyPoints+=5;
//		if(dangerousOvertaking)
//			totalPenaltyPoints+=5;
//		if(usingMobileWhileDriving)
//			totalPenaltyPoints+=4;
//		if(drivingDefectiveVehicle)
//			totalPenaltyPoints+=5;
//		if(crossingContinuousWhiteline)
//			totalPenaltyPoints+=4;
//	}
	public void calculatePenaltyPoints(){
		int total=0;
		if(drinkDrivingOffence)
			total+=5;
		if(caughtWithoutASeatbelt)
			total+=5;
		if(dangerousOvertaking)
			total+=5;
		if(usingMobileWhileDriving)
			total+=4;
		if(drivingDefectiveVehicle)
			total+=5;
		if(crossingContinuousWhiteline)
			total+=4;
		
		setTotalPenaltyPoints(total);
	}
	public boolean isDisqualified(){
		final int DISQUALIFIED_MIN = 12;
		
		if( getTotalPenaltyPoints() >  DISQUALIFIED_MIN)
			return true;
		else
			return false;
	}
}
