package com.ait.movies;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MovieTest {
	
	@Test
	public void testGetTitle() {
		Movie mov1 = new Movie();
		assertEquals("", mov1.getTitle());
	}
	@Test
	public void testGetGenre() {
		Movie mov1 = new Movie();
		assertEquals("", mov1.getGenre());
	}
	@Test
	public void testGetRating() {
		Movie mov1 = new Movie();
		assertEquals("", mov1.getRating());
	}
	@Test
	public void testGetOnLoan() {
		Movie mov1 = new Movie("Psycho", "Horror","****", false);
		assertEquals(false, mov1.isOnLoan());
	}
	@Test
	public void testSetTitle() {
		Movie mov1 = new Movie();
		mov1.setTitle("Psycho");
		assertEquals("Psycho", mov1.getTitle());
	}
	@Test
	public void testSetGenre() {
		Movie mov1 = new Movie();
		mov1.setGenre("Horror");
		assertEquals("Horror", mov1.getGenre());
	}
	@Test
	public void testSetRating() {
		Movie mov1 = new Movie();
		mov1.setRating("****");
		assertEquals("****", mov1.getRating());
	}
	@Test
	public void testSetOnLoan() {
		Movie mov1 = new Movie("Psycho", "Horror","****", false);
		assertEquals(false, mov1.isOnLoan());
	}
}
