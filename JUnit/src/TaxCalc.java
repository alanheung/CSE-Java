import java.util.Scanner;

public class TaxCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Are you married or single?(m/s): ");
		String status = sc.next();

		System.out.print("Please enter an income: ");
		double income = sc.nextDouble();

		//gets the Tax from getTax method
		double total = getTax(status, income);

		//calculations
		System.out.println("The tax total: € "+ (Math.round(total)) );
	}

	public static double getTax(String status, double income){
		double total = 0.0;
		double total1 = 0.0;
		double total2 = 0.0;
		double total3 = 0.0;

		if(status.equalsIgnoreCase("M")){
			if(income <= 21450 ){
				total = (income/4.66200)*0.15;
			}else if(income <= 51900){
				total1 = (income/4.66200)*0.15;
				total2 = (income/3.28407)*0.28;
				total = total1 + total2;
			}else if(income > 51900){
				total1 = (income/4.66200)*0.15;
				total2	= (income/3.28407)*0.28;
				total3 = (income/2.07900)*0.31;
				total = total1+total2+total3;
			}
			else if(status.equalsIgnoreCase("S")){
				if(income <= 35800){
					total = (income/4.66200)*0.15;
				}else if(income <= 81500){
					total1 = (income/4.66200)*0.15;
					total2 = (income/3.28407)*0.28;
					total = total1 + total2;
				}else if(income > 81500){
					total1 = (income/4.66200)*0.15;
					total2	= (income/3.28407)*0.28;
					total3 = (income/2.07900)*0.31;
					total = total1+total2+total3;
				}
			}
		}
		return total;
	}
}

//3217.5 4.66200
//8526 3.28407
//14911 2.07900

