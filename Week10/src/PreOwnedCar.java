/**
 * @author A00226315
 */
public class PreOwnedCar {

	private String make;
	private String model;
	private String regNo;
	
	public PreOwnedCar() {
		super();
	}

	/**
	 * 
	 * @param String make
	 * @param String model
	 * @param String regNo
	 */
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
