package com.golfSolution;

// boundaries 65 weekdays/80 weekends
//el paso resident pays 45 weekdays/60 weekends
//senior over 60(including) <90 40 weekdays/50 weekends
//junior over <10 17(including) 20 weekdays/30 weekends
public class CalculateGolfFee {

	private double golfFee;
	private final static int SUNDAY=1;
	private final static int SATURDAY=7;
	private static final int JUNIOR_WEEKDAY=20;
	private static final int JUNIOR_WEEKEND=30;
	private static final int RESIDENT_WEEKEND=60;
	private static final int NON_RESIDENT_WEEKEND=80;
	private static final int RESIDENT_WEEKDAY=45;
	private static final int NON_RESIDENT_WEEKDAY=60;	
	private static final int SENIOR_WEEKDAY=40;
	private static final int SENIOR_WEEKEND=50;

	/**
	 *
	 * @param age
	 * @param elPasoResident
	 * @param dayOfWeek
	 * @return
	 */
	public double calculateGolfFee(int age, boolean hotelResident, int day){
		if((age<10)||(age>89)){
			throw new IllegalArgumentException("illegal age: [ "+age+" ]");
		}
		if((day<SUNDAY)||(day>SATURDAY)){
			throw new IllegalArgumentException("illegal day: [ "+day+" ]");
		}

		if(age<18){//10-17
			return getJuniorFee(day);
		}else if (age<60){
			return getStandardFee(day, hotelResident);
		}else{
			return getSeniorFee(day);
		}
	}

	private double getJuniorFee(int day){
		if((day==SUNDAY)||(day==SATURDAY)){
			golfFee=JUNIOR_WEEKEND;
		}else{
			golfFee=JUNIOR_WEEKDAY;
		}
		return golfFee;
	}

	private double getStandardFee(int day,boolean hotelResident){
		if((day==SUNDAY)||(day==SATURDAY)){
			if(hotelResident){
				golfFee=RESIDENT_WEEKEND;
			}else{
				golfFee=NON_RESIDENT_WEEKEND;
			}
		}else{
			if(hotelResident){
				golfFee=RESIDENT_WEEKDAY;
			}else{
				golfFee=NON_RESIDENT_WEEKDAY;
			}
		}
		return golfFee;
	}

	private double getSeniorFee(int day){
		if((day==SUNDAY)||(day==SATURDAY)){
			golfFee=SENIOR_WEEKEND;
		}else{
			golfFee=SENIOR_WEEKDAY;
		}
		return golfFee;
	}
}//end