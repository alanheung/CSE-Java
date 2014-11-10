package com.ait.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.ait.moviecatalog.Movie;

public class MovieTest {
	Movie movie;
	
	@Test
	public void testDefaultConstructor(){
		movie = new Movie();
		assertEquals("",movie.getTitle());
		assertEquals("",movie.getRating());
		assertEquals(false,movie.getOnLoan());
	}
	
	@Test
	public void testConstructor(){
		movie = new Movie("End Of Watch", "10/10", false,"Action");
		assertEquals("End Of Watch",movie.getTitle());
		assertEquals("10/10",movie.getRating());
		assertEquals(false,movie.getOnLoan());
		assertEquals("Action",movie.getGenre());
	}
	
	@Test
	public void testSetters(){
		movie = new Movie("End Of Watch", "8/10", true,"Action");
		movie.setTitle("The Fifth Element");
		assertEquals("The Fifth Element",movie.getTitle());
		movie.setRating("8/10");
		assertEquals("8/10",movie.getRating());
		movie.setOnLoan(true);
		assertEquals(true,movie.getOnLoan());
		movie.setGenre("Drama");
		assertEquals("Drama",movie.getGenre());
	}
	
}
