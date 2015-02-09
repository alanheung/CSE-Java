
public class CalculateFare {
	private static final double DISCOUNT_0_TO_6=1;
	private static final double DISCOUNT_6_TO_18=0.5;
	private static final double DISCOUNT_18_TO_65=0;
	private static final double DISCOUNT_OVER_65_PEAK=0.1;
	private static final double DISCOUNT_OVER_65_OFFPEAK=0.2;
	private boolean peakHours;
	private double discountedFare;
	
	public void setPeakTravelTime(boolean peakHours){
		this.peakHours=peakHours;
	}
	
	public double calculateDiscountedFare(int age, double fullFare){
//		double fare=0.0;
//		int time = 0;
//		if(age >=5){
//			fare=0;
//		}else if(age >=6 && age <=17){
//			fare=(fullFare-(fullFare+0.50));
//		}else if(age >=18 && age <=64){
//			fare=fullFare;
//		}else if(age>65 && setPeakHours(time)==true){
//			fare=(fullFare-(fullFare*0.1));//on peak
//		}else if(age>65 && setPeakHours(time)==false){
//			fare=(fullFare-(fullFare*0.2));//off peak
//		}
//		return fare;


		
		if(age<0){
			throw new IllegalArgumentException("illegal age: [ "+age+" ]");
		}
		if(fullFare<0){
			throw new IllegalArgumentException("illegal fare: [ "+fullFare+" ]");
		}
		if(age<6){
			discountedFare=fullFare - (fullFare*DISCOUNT_0_TO_6);
		}else if(age<18){
			discountedFare=fullFare - (fullFare*DISCOUNT_6_TO_18);
		}else if(age<65){
			discountedFare=fullFare - (fullFare*DISCOUNT_18_TO_65);
		}else{
			discountedFare=calculateOver65Fare(fullFare);
		}
		return discountedFare;
	}
	
	private double calculateOver65Fare(double fullFare){
		if(peakHours == true){
			discountedFare=fullFare-(fullFare*DISCOUNT_OVER_65_PEAK);
		}else{
			discountedFare=fullFare-(fullFare*DISCOUNT_OVER_65_OFFPEAK);
		}
		return discountedFare;
	}
	
	//boolean argument if current time is within peak hours or not
//	public static boolean setPeakHours(int time){
//		if((time > 18) && (time < 16)){//peak hours
//			return true;
//		}else{//non peak hours
//			return false;
//		}
//	}

}

//boundary values 0>=5 free
//6>=17 0.5 discount
//18>=64 full fare
//>65 0.1 discount peak, 0.2 discount non-peak