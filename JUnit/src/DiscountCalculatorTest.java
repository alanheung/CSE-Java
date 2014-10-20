import static org.junit.Assert.*;
import  org.junit.Before;
import  org.junit.After;
import  org.junit.Test;

public class DiscountCalculatorTest{
	@Test
	public void testCustomerGSubtotalIsGreaterThan250() {

		// MyClass is tested
		DiscountCalculator tester = new DiscountCalculator();

		// Tests
//		Test 1: Customer Type =G and subtotal >250
		assertEquals("discount", 0.2, tester.getDiscountPercent("G",300),0.001);

//		Test 2: Customer Type=G and subtotal<250
		assertEquals("discount", 0.1, tester.getDiscountPercent("G",150),0.001);
	}
}

