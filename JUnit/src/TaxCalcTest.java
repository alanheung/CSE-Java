import static org.junit.Assert.*;
import org.junit.Test;

public class TaxCalcTest {
	@Test
	public void testGetTax0() {
		// MyClass is tested
		TaxCalc tester = new TaxCalc();

		String status = "M";
		double income = 100000;
		
		double expected = 26655;
		double result =	tester.getTax(status, income);	
		
		// Tests
		assertEquals(expected, result ,0.001);

		assertEquals("26655", tester.getTax("S",100000),0.001);
		

	}

}