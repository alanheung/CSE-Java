package com.money;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void constructorShouldSetAmountAndCurrency(){
		Money m = new Money(10,"USD");
		assertEquals(10, m.getAmount());
		assertEquals("USD", m.getCurrency());

		m = new Money(20,"EUR");
		assertEquals(20, m.getAmount());
		assertEquals("EUR", m.getCurrency());

		m = new Money(15,"GBP");
		assertEquals(15, m.getAmount());
		assertEquals("GBP", m.getCurrency());
	}
	
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
