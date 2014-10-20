class Phone{
	private String theNumber;
	private String theOwnersName;
	private double thePrice;
	
	public Phone(){
		theNumber = "";
		theOwnersName = "";
		thePrice = 0.0;
	}
	public Phone(String aNumber, String aOwnersName, double aPrice){
		theNumber = aNumber;
		theOwnersName = aOwnersName;
		thePrice = aPrice;
	}
	public String getNumber() {
		return theNumber;
	}
	public String getOwnersName() {
		return theOwnersName;
	}
	public double getPrice() {
		return thePrice;
	}
	public void setNumber(String aNumber) {
 		theNumber = aNumber;
	}
	public void setOwnersName(String aOwnersName) {
		 theOwnersName = aOwnersName;
	}
	public void setPrice(double aPrice) {
		 thePrice = aPrice;
	}
	@Override
	public String toString(){
		return "The phone number is "+ theNumber +", "+ theOwnersName
				+" owns this phone. The phone costs �"+ thePrice;
	}
}
public class PhoneTest {
	public static void main(String[] args) {
		Phone p1 = new Phone();
//		System.out.println(p1.getPrice());
		
		p1.setNumber("0879876543");
		p1.setOwnersName("Tom");
		p1.setPrice(50.00);
//		System.out.println("The number is " + p1.getNumber());
//		System.out.println("The name is " + p1.getOwnersName());
//		System.out.println("The price is " + p1.getPrice());

		Phone p2 = new Phone("0871234567", "Alan", 20.00);
//		System.out.println(p2.getNumber() +" "+p2.getOwnersName() +" "+p2.getPrice());
		
		Phone p3 = new Phone("0869153578", "James", 984);
//		System.out.println("The number is " + p3.getNumber());
//		System.out.println("The name is " + p3.getOwnersName());
//		System.out.println("The price is " + p3.getPrice());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}
}
