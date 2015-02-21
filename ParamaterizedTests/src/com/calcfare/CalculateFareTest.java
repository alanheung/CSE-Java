package com.calcfare;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)

public class CalculateFareTest {
	private final static double VALID_FULL_FARE = 20.0;
	private final static double INVALID_FARE = -1.1;
	private final static int VALID_AGE = 20;
//	static CalculateFare calcFare = new CalculateFare();
	private CalculateFare calcFare;
	
//	@Parameters
//	private static final Object[] getFares(){
//		return new Object[]{
//				new Object[]{1,10,0,false},
//				new Object[]{4,10,0,false},
//				new Object[]{5,10,5,false},
//				new Object[]{6,10,5,false},
//				new Object[]{7,10,5,false},
//				new Object[]{16,10,5,false},
//				new Object[]{17,10,5,false},
//				new Object[]{18,10,10,false},
//				new Object[]{19,10,10,false},
//				new Object[]{63,10,12,false},
//				new Object[]{64,10,12,false},
//				new Object[]{65,10,12,false},
//				new Object[]{63,10,11,true},
//				new Object[]{64,10,11,true},
//				new Object[]{65,10,11,true},
//		};
//	}
	//boundary values 0>=5 free -1,0,1 4,5,6
	//6>=17 0.5 discount 5,6,7 16,17,18
	//18>=64 full fare 17,18,19 63,64,65
	//>65 0.1 discount peak, 0.2 discount non-peak 66,
	@Before
	public void setUp(){
		calcFare = new CalculateFare();
	}
	@Parameters
	private static final Object[] getPeakHourValues(){
		return $(
				$(0,1.0,0.0), $(1,10.0,0.0),$(4,20.0,0.0),
				$(5,20.0,0.0),$(6,20.0,10.0),$(7,10.0,5.0), 
				$(16,15.0,7.50),$(17,15.0,7.5),$(18,12.0,12.0), 
				$(19,44.0,44.0),$(63,37.0,37.0), $(64,37.0,37.0),
				$(65,20.0,18.0), $(66,20.0,18.0)
				);
	}
	
	@Parameters
	private static final Object[] getOffPeakHourValues(){
		return $(
				$(0,1.0,0.0), $(1,10.0,0.0),$(4,20.0,0.0),
				$(5,20.0,0.0),$(6,20.0,10.0),$(7,10.0,5.0), 
				$(16,15.0,7.50),$(17,15.0,7.5),$(18,12.0,12.0), 
				$(19,44.0,44.0),$(63,37.0,37.0), $(64,37.0,37.0),
				$(65,20.0,16.0), $(66,40.0,32.0)
				);
	}
	@Parameters
	private static final Object[] getInvalidAge(){
		return $(
				$(-1),$(-5),$(-40)
				);
	}
	
//	@Before
//	public void setUp(){
//		calcFare = new CalculateFare();
//	}
//	1. If you have used a static method in the CalculateFare class, you will not need 
//  the setup() method.
	
//	@Test
//	@Parameters(method="getFares")
//	public void test(int age, double fullFare, double result, boolean time){//passes the three values
//		CalculateFare cf1 = new CalculateFare();//create the object
//		assertEquals(result,cf1.calculateDiscountedFare(age, fullFare),0.01);
//	}
	@Test
	@Parameters(method="getPeakHourValues")
	public void calculateFarePeakHours(int age, double fullFare, double discountedFare){//passes the three values
		calcFare.setPeakTravelTime(true);
		assertEquals(discountedFare,calcFare.calculateDiscountedFare(age, fullFare),0.0001);
	}
	
	@Test
	@Parameters(method="getOffPeakHourValues")
	public void calculateFareOffPeakHours(int age, double fullFare, double discountedFare){//passes the three values
		calcFare.setPeakTravelTime(true);
		assertEquals(discountedFare,calcFare.calculateDiscountedFare(age, fullFare),0.0001);
	}
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidAge")
	public void constructorShouldThrowIAEForInvalidAge(int invalidAge) {
		calcFare.setPeakTravelTime(false);
		calcFare.calculateDiscountedFare(invalidAge, VALID_FULL_FARE);//these values are invalid - RED
	}
	@Test(expected = IllegalArgumentException.class)
	public void constructorShouldThrowIAEForInvalidFare() {
		calcFare.setPeakTravelTime(false);
		calcFare.calculateDiscountedFare(VALID_AGE, INVALID_FARE);//these values are invalid - RED
	}

}
