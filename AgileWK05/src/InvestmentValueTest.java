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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class InvestmentValueTest {
@Parameters
private static final Object[] getValues(){
return new Object[]{
new Object[]{3,2000,2122.42},
new Object[]{3,4000,4630.50},
new Object[]{3,7000,8575.30}
};
}

private static final double DELTA = 1e-2;

@Test
@Parameters(method="getValues")
public void test(int term,int startAmount,double expected){
InvestmentValue IV = new InvestmentValue();
assertEquals(expected,IV.calculateInvestmentValue(term, startAmount),DELTA);
}


}