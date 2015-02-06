//import static org.junit.Assert.assertEquals;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized.Parameters;
//
//@RunWith(JUnitParamsRunner.class)
//
//public class InvestmentValueTest {
//
//	@Before
//	public void setUp() throws Exception {
//		InvestmentValue inv1 = new InvestmentValue(0,0);
//	}
//
//	@Parameters
//	private static final Object[] getParams(){
//		return new Object[]{
//				new Object[]{3, 1000},
//				new Object[]{3, 2000}
//		};
//	}
//
//	@Test
//	@Parameters (method="getParams")
//	public void testGettersAndSetters() {
//		InvestmentValue inv1 = new InvestmentValue(0,0);
//		inv1.setYear(3);
//		assertEquals(3,inv1.getYear());
//		inv1.setAmount(1000);
//		assertEquals(1000,inv1.getAmount());
//
//	}
//
//	@Test
//	public void testGetRate(){
//		InvestmentValue inv1 = new InvestmentValue(0,0);
//		assertEquals("0.02",inv1.getRate(2999));
//		assertEquals("0.05",inv1.getRate(3999));
//		assertEquals("0.07",inv1.getRate(6999));
//	}
//
//	@Test
//	public void testCalculateInvestment() {
//		assertEquals("1061", InvestmentValue.calculateInvestment(3, 1000));
//		assertEquals("2122", InvestmentValue.calculateInvestment(3, 2000));
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//}

import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class InvestmentValueTest {
	private final static int VALID_TERM = 3;
	private final static int VALID_STARTAMOUNT = 2000;
	private final static int VALID_AMOUNT = 2122;
	//	@Parameters
	//	private static final Object[] getValues(){
	//		return new Object[]{
	//				new Object[]{3,1000,1061.21},
	//				new Object[]{4,1001,1083.51},
	//				new Object[]{5,2000,2208.16},
	//				new Object[]{6,2998,3376.23},
	//				new Object[]{6,2999,3377.36},
	//				new Object[]{7,3000,4221.30},
	//				new Object[]{8,3001,4433.84},
	//				new Object[]{9,4000,6205.31},
	//				new Object[]{10,4998,8141.84},
	//				new Object[]{10,4999,8142.84},
	//				new Object[]{3,5000,6125.22},
	//				new Object[]{4,5001,6555.29},
	//				new Object[]{5,7000,9817.86},
	//				new Object[]{6,9999,15005.80},
	//				new Object[]{7,10000,16057.81}
	//
	//
	//		};
	//	}

	//boundaries 1000-2999 999,1000,1001 2998,2999,3000  
	//3000-4999  2999,3000,3001 4998,4999,5000
	//5000-10000 4999,5000,5001 9998,9999,10000
	@Parameters
	private static final Object[] getValues(){
		return $(
				$(3,1000,1061.21),
				$(4,1001,1083.51),
				$(5,2000,2208.16),
				$(6,2998,3376.23),
				$(6,2999,3377.36),
				$(7,3000,4221.30),
				$(8,3001,4433.84),
				$(9,4000,6205.31),
				$(10,4998,8141.84),
				$(10,4999,8142.84),
				$(3,5000,6125.22),
				$(4,5001,6555.29),
				$(5,7000,9817.86),
				$(6,9999,15005.80),
				$(7,10000,16057.81)
				);
	}

	private static final double DELTA = 1e-2;//rounds off the decimals

	@Parameters
	private static final Object[] getInvalidValue(){
		return new Integer[][]{
				{999},{10001},{-100}
		};
	}

	@Parameters
	private static final Object[] getInvalidTerm(){
		return $(
				$(2),
				$(11),
				$(-10)
				);//these values are out of bounds and should be red
	}

	@Test
	@Parameters(method="getValues")
	public void testValidStartAmounts(int term,int startAmount,double result){//passes the three values
		InvestmentValue IV1 = new InvestmentValue();//create the object
		assertEquals(result,IV1.calculateInvestmentValue(term, startAmount),DELTA);
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidValue")
	public void constructorShouldThrowIAEForInvalidValueForStartAmount(int startAmount) {
		InvestmentValue IV1 = new InvestmentValue();
		IV1.calculateInvestmentValue(startAmount, VALID_TERM);//these values are invalid - RED
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidValue")
	public void constructorShouldThrowIAEForInvalidValueForTermAmount(int term) {
		InvestmentValue IV1 = new InvestmentValue();
		IV1.calculateInvestmentValue(term, VALID_STARTAMOUNT);//these values are invalid - RED
	}

}