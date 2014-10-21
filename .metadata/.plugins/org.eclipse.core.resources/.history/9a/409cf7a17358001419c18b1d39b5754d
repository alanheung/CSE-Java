class Phone{
	private String theNumber;
	private String theOwnersName;
	private double thePrice;
	public Phone(){
		theNumber = "";
		theOwnersName = "";
		thePrice = 0;
	}
	public Phone(String aNumber, String aOwnersName, double aPrice){
		theNumber = aNumber;
		theOwnersName = aOwnersName;
		thePrice = aPrice;
	}
	public String getNumber(){
		return theNumber;
		
	}
	public String getOwnersName(){
		return theOwnersName;
	}
	public double getPrice(){
		return thePrice;
	}
	public void setNumber(String aNumber){
		theNumber = aNumber;
	}
	public void setOwnersName(String aOwnersName){
		theOwnersName = aOwnersName;
	}
	public void setPrice(double aPrice){
		thePrice = aPrice;
	}
	@Override
	public String toString(){
		String returnString = "";
		returnString = "Owner: " + theOwnersName;
		returnString += " Number: " + theNumber;
		returnString += " Price: " + thePrice;
		return returnString;
	}
}
public class PhoneExample {
	public static void main(String[] args){
		Phone p1 = new Phone();
		Phone p2 = new Phone("111", "Joe", 25);

		p1.setNumber("222");
		p1.setOwnersName("jack");
		p1.setPrice(50);
		System.out.println(p1.getNumber());
		System.out.println(p1.getOwnersName());
		System.out.println(p1.getPrice());
		
		System.out.println();
		
		p2.setNumber("333");
		p2.setOwnersName("jack");
		p2.setPrice(50);
		System.out.println(p2.getNumber());
		System.out.println(p2.getOwnersName());
		System.out.println(p2.getPrice());
		
		System.out.println();
		
		System.out.println(p1.getNumber().equals(p2.getNumber()));
		System.out.println(p1.getOwnersName().equals(p2.getOwnersName()));
		System.out.println(p1.getPrice() == p2.getPrice());
		
		System.out.println(p1); // Any time an object reference is called it uses the toString method in the background which is overridden above
	}
}
