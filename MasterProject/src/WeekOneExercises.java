import java.util.Scanner;


public class WeekOneExercises {
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
//		if(didOswaldActAlone()){
//			System.out.println("Acted alone");
//		}else{
//			System.out.println("Conspiracy");
//		}
//		rating();
		String swimmersCountry = swimmerRating();
		System.out.println( getSwimmersCountry(swimmersCountry));
//		swimmerRating();
		
	}
	
	public static String getSwimmersCountry(String swimmersName){
		System.out.print("Please enter country "+swimmersName+":");
		return sc.nextLine();
	}
	
	public static String swimmerRating(){
		String swimmersName="", country="error";
		double rating=0.0;
		System.out.print("Enter a full name ");
		swimmersName = sc.nextLine();
		System.out.print("Enter a rating ");
		boolean b = sc.hasNextDouble();
		if(b == true){
			rating = sc.nextDouble();
			System.out.println("The swimmers name is "+ swimmersName +" the rating is "+rating);
			country = getSwimmersCountry(swimmersName);
			return country;
		}else{
			System.out.println("Invalid input");
			return country;
		}

	}
	
	 public static void rating(){
			int filmRating=0;
			System.out.print("Enter a film name ");
			String filmName =sc.nextLine();
			System.out.print("Enter a rating ");
			try{	
				filmRating = sc.nextInt();
			}catch(IndexOutOfBoundsException e){
				System.out.println("Exception caught");
			}
			System.out.println("Film name is "+filmName);
			System.out.println("Film rating is "+filmRating);


	 }
	public static boolean didOswaldActAlone(){
		System.out.print("Did Oswald do it alone? (true/false) ");
		return sc.nextBoolean();
	}
}//
