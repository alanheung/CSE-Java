package com.exam;

public class CarParkFee {

	private static final double HOUR=2.00;
	private static final double DAILY_MAX=10.00;
	private static final double WEEKLY_MAX=50.00;
	private static final double DIS_PERMIT=0.20;
	/**
	 * 
	 * @param hours
	 * @param days
	 * @param weeks
	 * @param permit 
	 * @return
	 */
	public double calculateFee(int hour, int day, int week, boolean disabled){
		//invalid
		//minimum of hour
		if((hour<0)||(hour>24)){ 
			throw new IllegalArgumentException("illegal hour: [ "+hour+" ]");  
		}
		//more than 7 days
		if((day<0)||(day>7)){ 
			throw new IllegalArgumentException("illegal day: [ "+day+" ]");
		}
		//max is week
		if((week<0)||(week>1)){ 
			throw new IllegalArgumentException("illegal week: [ "+week+" ]");
		}
		//exceed a week eg 1 day or 1 hour
//		if((hour>0)||(day>0)&&(week==1)){
//			throw new IllegalArgumentException("illegal exceed limit: " +
//					"[ "+week+" ], day: ["+day+" ], day: ["+hour+" ]");
//		}
		double fee = 0;
		double total = 0;
		
		total = (hour*HOUR)+(day*DAILY_MAX)+(week*WEEKLY_MAX);
		//gets the fee total, with zeros and then pass it down to 
		//if statements to check whether disabled or not
		//�	Drivers with a disability permit receive a 20% discount
		//�	The maximum amount payable per week is �50
		if (disabled){//check if disabled	
//			if(hour<24){
//				total=hour*HOUR;
//			} 
//			if(day<7){
//				total=day*DAILY_MAX;
//			}
//			if(week<1){
//				total=week*WEEKLY_MAX;
//			}
			fee=total*DIS_PERMIT;  
			return fee;
		}else{//else not disabled
//			if(hour<24){
//				total=hour*HOUR;
//			}
//			if(day<7){
//				total=day*DAILY_MAX;
//			}
//			if(week<1){
//				total=week*WEEKLY_MAX;
//			}
			fee=total;
			return fee;
		}
	}
}//end