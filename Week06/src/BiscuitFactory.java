import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BiscuitFactory {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		Biscuit b1 = new Biscuit("Cream Crackers","Jacobs",20, 500);
//		System.out.println(b1);
//		
//		Biscuit b2 = new Biscuit();
//		b2.setTheBrand("Kylemore");
//		System.out.println(b2.getTheBrand());
//		
//		Biscuit b3 = new Biscuit("Jam","McVities",50, 750);
//		System.out.println(b3);
		
		Biscuit b4 = new Biscuit();
		b4.setTheBrand(getBrand());
		b4.setTheMaker(getMaker());
		b4.setTheNumberOfBiscuits(getNoBiscuits());
		b4.setTheWeight(getWeight());
		System.out.println(b4);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date bestBeforeDate = sdf.parse(getBestBeforeDateAsString());
		}catch(Exception e){
			System.out.println("Exception error");
		}
		Biscuit b5 = new Biscuit();
//		b5.setTheBrand(getBrand());
//		b5.setTheMaker(getMaker());
//		b5.setTheNumberOfBiscuits(getNoBiscuits());
//		b5.setTheWeight(getWeight());
//		b5.bestBeforeDate(getBestBeforeDateAsString());
		
		System.out.println(b5);	
	}

	public static String getBestBeforeDateAsString(){
		System.out.print("Please enter the date (yyyy-MM-dd): ");
		return sc.next();
	}
	public static String getBrand(){
		System.out.print("Please enter the brand: ");
		return sc.nextLine();
	}
	public static String getMaker(){
		System.out.print("Please enter the maker: ");
		return sc.nextLine();
	}
	public static int getNoBiscuits(){
		System.out.print("Please enter number of biscuits: ");
		return sc.nextInt();
	}
	public static int getWeight(){
		System.out.print("Please enter the weight: ");
		return sc.nextInt();
	}
}


