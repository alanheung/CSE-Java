package com.ait.cat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {

	@Test
	public void testGetName() {
		Cat kitty = new Cat("Kitty", 5, "black");
		assertEquals("Kitty", kitty.getName());
	}
	@Test
	public void testGetAge() {
		Cat kitty = new Cat("Kitty", 5, "black");
		assertEquals(5, kitty.getName());
	}
	@Test
	public void testGetColor() {
		Cat kitty = new Cat("Kitty", 5, "black");
		assertEquals("black", kitty.getName());
	}
	@Test
	public void testSetCatName() {
		Cat kitty = new Cat("kat", 5, "black");
		assertEquals("Kat", kitty.getName());
	}
	@Test
	public void testSetCatAge() {
		Cat kitty = new Cat("kat", 7, "black");
		assertEquals(7, kitty.getName());
	}
	@Test
	public void testSetCatColor() {
		Cat kitty = new Cat("kat", 5, "white");
		assertEquals("white", kitty.getName());
	}
}
