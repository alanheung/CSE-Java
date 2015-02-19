package com.golfSolution;

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
// sen >60 <90 40/50 59,60,61-89,90,91

public class CalculateGolfFeeTest {

	private CalculateGolfFee calcGolfFee;
	private final static int VALID_AGE = 35;
	private final static int VALID_DAY = 4;
	private final static boolean EL_PASO_RESIDENT = true;
	private final static boolean NOT_EL_PASO_RESIDENT = false;

	@Parameters
	private static final Object[] getInvalidAge(){
		return $($(9),$(90)
				);
	}
	@Parameters
	private static final Object[] getInvalidDay(){
		return $($(0),$(8)
				);
	}
	@Parameters
	private static final Object[] getNonHotelResidentValues(){//age, elpaso, day, answer
		return $($(10,1,30.0),$(11,2,20.0),$(16,6,20.0),
				$(17,7,30.0),$(60,1,50.0),$(61,2,40),
				$(88,5,40),$(89,7,50),$(18,1,80.0),
				$(19,2,60.0),$(58,5,60),$(59,7,80.0)		
				);
	}
	@Parameters
	private static final Object[] getHotelResidentValues(){//age, elpaso, day, answer
		return $($(10,1,30.0),$(11,2,20.0),$(16,6,20.0),
				$(17,7,30.0),$(60,1,50.0),$(61,2,40),
				$(88,5,40),$(89,7,50),$(18,1,60.0),
				$(19,2,45.0),$(58,5,45),$(59,7,60.0)
				);
	}

	@Before
	public void setUp(){
		calcGolfFee = new CalculateGolfFee();
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidAge")
	public void calGolfFeeShouldThrowIAEForInvalidAge(int invalidAge) {
		calcGolfFee.calculateGolfFee(invalidAge,EL_PASO_RESIDENT,VALID_DAY);
	}
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidDay")
	public void calGolfFeeShouldThrowIAEForInvalidDay(int invalidDay) {
		calcGolfFee.calculateGolfFee(VALID_AGE,EL_PASO_RESIDENT,invalidDay);
	}
	@Test
	@Parameters(method="getNonHotelResidentValues")
	public void calculateFeeNonResident(int age, int day, double fee){//passes the three values
		assertEquals(fee,calcGolfFee.calculateGolfFee(age, NOT_EL_PASO_RESIDENT, day),0.0001);
	}
	@Test
	@Parameters(method="getHotelResidentValues")
	public void calculateFeeResident(int age, int day, double fee){//passes the three values
		assertEquals(fee,calcGolfFee.calculateGolfFee(age, EL_PASO_RESIDENT, day),0.0001);
	}
}