package com.ait.movies;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MovieTest {

	@Test
	public void testGetTitle() {
		Movie mov1 = new Movie();
		assertEquals("Psycho", mov1.getTitle());
	}
	@Test
	public void testGetGenre() {
		Movie mov1 = new Movie();
		assertEquals("Horror", mov1.getTitle());
	}
	@Test
	public void testGetRating() {
		Movie mov1 = new Movie();
		assertEquals("4*", mov1.getTitle());
	}
	@Test
	public void testGetOnLoan() {
		Movie mov1 = new Movie();
		assertEquals(true, mov1.getTitle());
	}
	@Test
	public void testSetTitle() {
		Movie mov1 = new Movie();
		assertEquals("Psycho", mov1.getTitle());
	}
	@Test
	public void testSetGenre() {
		Movie mov1 = new Movie();
		assertEquals("Horror", mov1.getTitle());
	}
	@Test
	public void testSetRating() {
		Movie mov1 = new Movie();
		assertEquals("4*", mov1.getTitle());
	}
	@Test
	public void testSetOnLoan() {
		Movie mov1 = new Movie();
		assertEquals(true, mov1.getTitle());
	}
}
