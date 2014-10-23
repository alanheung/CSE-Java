package com.ait.cat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CatPoundTest {

	private CatPound myCat;

	@Before
	public void setUp(){
		myCat = new CatPound();
	}
	@Test
	public void testNoCatsInPound() {
		assertEquals(0,myCat.getNumberOfCats());
	}
	@Test
	public void testOneCatInPound() {
		Cat missy = new Cat ("missy",4,"brown");
		myCat.addCat(missy);
		assertEquals(1,myCat.getNumberOfCats());
	}
	@Test
	public void removeOneCatInPound() {
		Cat missy = new Cat ("missy",4,"brown");
		myCat.removeCat(missy);
		assertEquals(0,myCat.getNumberOfCats());
	}
	@Test
	public void testSearchCatName() {
		Cat firstCat = new Cat ("Jesse",4,"brown");
		Cat secondCat = new Cat ("Jo",4,"brown");
		myCat.addCat(firstCat);
		assertTrue(myCat.searchCatName("Jesse"));
		assertFalse(myCat.searchCatName("Jo"));
	}
	public void testFindCat() {
		Cat Cat1 = new Cat ("Jesse",4,"brown");
		Cat Cat2 = new Cat ("Jo",4,"brown");
		myCat.addCat(Cat1);
		myCat.addCat(Cat2);
		assertTrue(Cat1.findCat("Jesse"));
		assertFalse(Cat2.findCat("Jo"));
	}

}
