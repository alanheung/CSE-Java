// boundaries 65 weekdays/80 weekends
//el paso resident pays 45 weekdays/60 weekends
//senior over 60(including) <90 40 weekdays/50 weekends
//junior over <10 17(including) 20 weekdays/30 weekends

public class CalculateGolfFee {
	private static final double STANDARD_DAY_FEE=65;
	private static final double STANDARD_END_FEE=80;
	private static final double ELPASO_DAY_FEE=45;
	private static final double ELPASO_END_FEE=60;
	private static final double JUN_DAY_FEE=20;
	private static final double JUN_END_FEE=30;
	private static final double SEN_DAY_FEE=40;
	private static final double SEN_END_FEE=50;

	private double fee; 
	/**
	 * 
	 * @param age
	 * @param elPasoResident
	 * @param dayOfWeek
	 * @return
	 */
	public double calculateGolfFee(int age, boolean elPasoResident, int dayOfWeek){
		if((age<9)||(age>91)){ 
			throw new IllegalArgumentException("illegal age: [ "+age+" ]"); 
		}
		if((dayOfWeek<1)||(dayOfWeek<8)){
			throw new IllegalArgumentException("illegal day of the week: [ "+dayOfWeek+" ]");
		}
		
		if(dayOfWeek>=2 && dayOfWeek<=6){//if weekday 
			if(age>17){//10-17
				fee=JUN_DAY_FEE;//20
			}else if(age<61){ //18-60
				if(elPasoResident==true){
					fee=ELPASO_DAY_FEE;//45
				}else{ 
					fee=STANDARD_DAY_FEE;//65
				}		
			}else{//60-90
				fee=SEN_DAY_FEE;//40
			}
		}else{// if weekend
			if(age>17){//10-17
				fee=JUN_END_FEE;//30
			}else if(age<61){ //18-60
				if(elPasoResident==true){
					fee=ELPASO_END_FEE;//60
				}else{
					fee=STANDARD_END_FEE;//80
				}		
			}else{//60-90
				fee=SEN_END_FEE;//50
			}		
		}
		return fee;
	}

}//end
