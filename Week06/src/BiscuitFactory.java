import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BiscuitFactory {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		int [] ages = new int[3];
//
//		for(int i = 0; i<ages.length; i++){
//			System.out.println(ages[i]);
//		}
//		for(int age:ages)
//			System.out.println(age);
//
//		boolean [] x = new boolean[4];
//		for(boolean b:x)
//			System.out.println(b);
//		String [] sa = new String [3];
//		for(String s:sa){
//			System.out.println(s);
//		}

//		Biscuit b1 = new Biscuit("Cream Crackers","Jacobs",20, 500);
//		System.out.println(b1);
//		
//		Biscuit b2 = new Biscuit();
//		b2.setTheBrand("Kylemore");
//		System.out.println(b2.getTheBrand());
//		
//		Biscuit b3 = new Biscuit("Jam","McVities",50, 750);
//		System.out.println(b3);
		
//		Biscuit b4 = new Biscuit();
//		b4.setTheBrand(getBrand());
//		b4.setTheMaker(getMaker());
//		b4.setTheNumberOfBiscuits(getNoBiscuits());
//		b4.setTheWeight(getWeight());
//		System.out.println(b4);
		
		String brand = getBrand();
		String maker = getMaker();
		int weight = getWeight();
		int biscuits = getNumberOfBiscuits();
		String date = getBestBeforeDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date bestBeforeDate = null;
		try {
		bestBeforeDate = sdf.parse(date);
		} catch (ParseException e) {
		e.printStackTrace();
		}
		Biscuit bisc = new Biscuit(brand, maker, biscuits, weight, bestBeforeDate);
		System.out.println(bisc);
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
	public static int getNumberOfBiscuits(){
		System.out.print("Number of Biscuits: ");
		return sc.nextInt();
	}
	public static String getBestBeforeDate(){
		System.out.print("Please enter in the best before date (yyyy-mm-dd): ");
		return sc.next();
	}
}


