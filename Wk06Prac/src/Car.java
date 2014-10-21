class Car {
	private String carModel, carType;
	int ageOfCar;
	public Car(String carModel, String carType, int ageOfCar) {
		super();
		this.carModel = carModel;
		this.carType = carType;
		this.ageOfCar = ageOfCar;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getAgeOfCar() {
		return ageOfCar;
	}
	public void setAgeOfCar(int ageOfCar) {
		this.ageOfCar = ageOfCar;
	}
	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", carType=" + carType
				+ ", ageOfCar=" + ageOfCar + "]";
	}
	
}