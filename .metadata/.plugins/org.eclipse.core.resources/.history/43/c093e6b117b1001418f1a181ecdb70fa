import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)

//el paso resident pays 45 weekdays/60 weekends
//junior over <10 17(including) 20 weekdays/30 weekends
//senior over 60(including) <90 40 weekdays/50 weekends
//boundaries 65 weekdays/80 weekends

//boundary values jun >10 <17 20/30 9,10,11-16,17,18
// 				  sen >60 <90 40/50 59,60,61-89,90,91

public class CalculateGreenFeesTest {

	private final static int VALID_AGE = 65;	
	private final static int VALID_DOW = 5;
	private final static int INVALID_AGE = -1;
	private final static int INVALID_DOW = -7;

	
	static CalculateGolfFee GolfFee = new CalculateGolfFee();

	@Parameters
	private static final Object[] getWeekdayFees(){//age, elpaso, day, answer
		return $(
				$(9,false,1,65), $(10,false,2,20),$(11,false,3,20),
				$(16,false,4,20), $(17,false,5,20),$(18,false,1,65),
				$(59,false,2,45), $(60,false,3,40),$(61,false,4,40),
				$(89,false,5,40), $(90,false,1,40),$(91,false,2,0)
				);
	}
	private static final Object[] getWeekendFees(){
		return $(
				$(9,false,6,65), $(10,false,7,20),$(11,false,6,20),
				$(16,false,7,20), $(17,false,6,20),$(18,false,7,65),
				$(59,false,6,45), $(60,false,7,40),$(61,false,6,40),
				$(89,false,7,40), $(90,false,6,40),$(91,false,7,0)
				);
	}
//	private static final Object[] getElPasoFees(){
//		return $(
//				$(9,true,1,80), $(10,true,2,30),$(11,true,3,30),
//				$(16,true,4,30), $(17,true,5,30),$(18,true,1,80),
//				$(59,true,2,60), $(60,true,3,50),$(61,true,4,50),
//				$(89,true,5,50), $(90,true,1,50),$(91,true,2,0)
//				);
//	}
	
	@Parameters
	private static final Object[] getInvalidAge(){
		return $(
				$(-9),$(-4),$(-60)
				);
	}
	
	@Test
	@Parameters(method="getWeekdayFees")
	public void calculateFeeWeekdayValues(int age, boolean elPasoResident, int dayOfTheWeek, double fee){//passes the three values
		assertEquals(fee,GolfFee.calculateGreenFees(age, elPasoResident, dayOfTheWeek),0.0001);
	}
	
	@Test
	@Parameters(method="getWeekendFees")
	public void calculateFeeWeekendValues(int age, boolean elPasoResident, int dayOfTheWeek, double fee){//passes the three values
		assertEquals(fee,GolfFee.calculateGreenFees(age, elPasoResident, dayOfTheWeek),0.0001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidAge")
	public void constructorShouldThrowIAEForInvalidAge(int invalidAge, boolean elPasoResident, int dayOfTheWeek) {
		GolfFee.calculateGreenFees(invalidAge,true,VALID_DOW);
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidDayOfWeek")
	public void constructorShouldThrowIAEForInvalidDayOfWeek() {
		GolfFee.calculateGreenFees(VALID_AGE,true,INVALID_DOW);
	}
}
