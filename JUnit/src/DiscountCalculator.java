import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		String customerType;
		double subTotal;
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter customer type (g/s/b): ");
		customerType = sc.next();
		
		System.out.print("Please enter a subtotal: ");
		subTotal = sc.nextInt();
		
		//gets the discount from getDiscountPercent method
		double discount = getDiscountPercent(customerType, subTotal);
		//calculations
		double discountAmount = (subTotal * discount);
		double total = (subTotal - discount);
		System.out.println("The discount "+ discount +"%");
		System.out.println("The discount amount: �"+ discountAmount);
		System.out.println("The total: �"+total);
		
	}
	public static double getDiscountPercent(String customerType, double subTotal){
		double discount = 0.0;
		if(customerType.equalsIgnoreCase("G")){
			if(subTotal >= 250){
				discount = 0.2;
			}else if(subTotal >=100 && subTotal <= 250){
				discount = 0.1;
			}else if(subTotal <100){
				discount = 0.05;
			}else if(subTotal >=500){
				discount = 0.30;
			}else if(customerType.equalsIgnoreCase("S")){
				if(subTotal > 200){
					discount = 0.1;
				}else if(subTotal >=100 && subTotal <=200){
					discount = 0.05;
				}			
			}else if(customerType.equalsIgnoreCase("B")){
				if(subTotal >= 300){
					discount = 0.05;
				}else if(subTotal <300){
					discount = 0.0;
				}
			}
		}
		return discount;
	}
}
