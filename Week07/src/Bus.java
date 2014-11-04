
public class Bus {
	private int theNumberOfSeats;
	private static int theCount;
	private String theDriversName;
	private String theMake;
	
	public Bus(){
		theNumberOfSeats =0;
		theDriversName = "";
		theDriversName = "";
		theCount++;
	}
	public Bus(String theDriversName, int theNumberOfSeats, String theMake){
		this.theDriversName = theDriversName;
		this.theNumberOfSeats = theNumberOfSeats;
		this.theMake = theMake;
		theCount++;
	}
	public int getTheNumberOfSeats() {
		return theNumberOfSeats;
	}
	public void setTheNumberOfSeats(int theNumberOfSeats) {
		this.theNumberOfSeats = theNumberOfSeats;
	}
	public String getTheDriversName() {
		return theDriversName;
	}
	public void setTheDriversName(String theDriversName) {
		this.theDriversName = theDriversName;
	}
	public String getTheMake() {
		return theMake;
	}
	public void setTheMake(String theMake) {
		this.theMake = theMake;
	}
	public int getCount(){
		return Bus.theCount;
	}
	@Override
	public String toString(){
		return 	"The driver's name is " + theDriversName +
				", the no. of seats are " + theNumberOfSeats +
				", the make is " + theMake;
	}
}
