import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BiscuitFactory {
	static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 * @throws  
	 */
	public static void main(String[] args){
		String bBD = getBestBeforeDate();
		String maker = getMaker();
		String brand = getBrand();
		int weight = getWeight();
		int num = getNumOfBisc();
		Date bestBefore = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try{
			bestBefore = sdf.parse(bBD);
		}catch(Exception e){
			System.out.println("You entered it in wrong...IDIOT!");
		}
		
		Biscuit one = new Biscuit(maker, brand, weight, num, bestBefore);
		System.out.println(one);
	}
	
	public static String getBestBeforeDate(){
		System.out.print("Enter in Best before date in yyyy-mm-dd formate: ");
		return sc.next();
	}
	
	public static String getMaker(){
		
		
		System.out.print("Name of maker: ");
		return sc.next();
	}
	
	public static String getBrand(){
		System.out.print("Name of brand: ");
		return sc.next(); 
	}
	
	public static int getWeight(){
		System.out.print("Weight of Biscuits: ");
		return sc.nextInt();
	}
	
	public static int getNumOfBisc(){
		System.out.print("Number of Biscuits: ");
		return sc.nextInt();
	}

}
