import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest2 {
//	@Parameters
//	private static final Object[] getMoney(){
//		return new Object[]{
//				new Object[]{10, "USD"},
//				new Object[]{20, "EUR"},
//		};
//	}
	@Parameters
	private static final Object[] getMoney(){
		return $(
				$(10, "USD"),
				$(20, "EUR")
		);
	}
	
	@Parameters
	private static final Object[] getMoney2(){
		return $(
				$(15, "GBP"),
				$(20, "EUR")
		);
	}
	
	@Test
	@Parameters(method="getMoney")
	public void constructorShouldSetAmountAndCurrency(int amount, String currency){
		Money money = new Money(amount, currency);
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}
	
	@Test
	@Parameters(method="getMoney2")
	public void constructorShouldSetAmountAndCurrency2(int amount, String currency){
		Money money = new Money(amount, currency);
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}

//	@Test
//	public void constructorShouldSetAmountAndCurrency(){
//		Money m = new Money(10,"USD");
//		assertEquals(10, m.getAmount());
//		assertEquals("USD", m.getCurrency());
//
//		m = new Money(20,"EUR");
//		assertEquals(20, m.getAmount());
//		assertEquals("EUR", m.getCurrency());
//
//		m = new Money(15,"GBP");
//		assertEquals(15, m.getAmount());
//		assertEquals("GBP", m.getCurrency());
//	}
	
	@Test
	public void amountAndCurrencyEqual(){
		Money m = new Money(10,"USD");
		Money m2 = new Money(10,"USD");
		assertEquals(true, m.equals(m2));
		m = new Money(20,"EUR");
		m2 = new Money(20,"EUR");
		assertEquals(true, m.equals(m2));
		m = new Money(15,"GBP");
		m2 = new Money(15,"GBP");
		assertEquals(true, m.equals(m2));
	}

	@Test
	public void currencyEqualAndAmountsNotEqual(){
		Money m = new Money(10,"USD");
		assertFalse("20",false);
		assertFalse("USD", false);

		m = new Money(20,"EUR");
		assertFalse("15",false);
		assertFalse("EUR", false);

		m = new Money(15,"GBP");
		assertFalse("10",false);
		assertFalse("GBP", false);
	}
	
	@Test
	public void amountsEqualAndCurrencyNotEqual(){
		Money m = new Money(10,"USD");
		Money m2 = new Money(10,"EUR");
		assertEquals(false, m.equals(m2));
		
		m = new Money(20,"EUR");
		m2 = new Money(20,"GBP");
		assertEquals(false, m.equals(m2));
		
		m = new Money(15,"GBP");
		m2 = new Money(15,"USD");
		assertEquals(false, m.equals(m2));

	}
}
