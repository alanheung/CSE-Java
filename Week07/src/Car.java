
public class Car {
	private String make;
	private String model;
	private double engineSize;
	private static int count;
	private boolean isAutomatic;
	private String colour;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isAutomatic() {
		return isAutomatic;
	}
	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	public Car(){
		make ="";
		model = "";
		engineSize = 0.0;
		count++;
		isAutomatic = false;
		colour = "";
	}
	public Car(String make, String model, double engineSize, boolean isAutomatic, String colour){
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		this.isAutomatic = isAutomatic;
		this.colour = colour;
		count++;
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
	public double getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	public int getCount(){
		return Car.count;
	}
	
	@Override
	public String toString(){
		return 	"The make is " + make +
				", the model is " + model +
				", the engine size is " + engineSize +
				",\nautomatic = "+ isAutomatic +
				", the colour is " + colour;
				
	}
	
}//
