package com.movie.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.movies.Movie;

public class MovieTest {

	@Test
	public void testCreate() {
		Movie movie = new Movie ("Finding Nemo");
		String movieName = movie.getName();
		assertEquals("Finding Nemo", movieName);
	}
	@Test
	public void testCreateTwoMovies() {
		Movie movie = new Movie ("Finding Nemo");
		String movieName = movie.getName();
		assertEquals("Finding Nemo", movieName);
		
		Movie movie2 = new Movie ("Toy Story");
		String movieName2 = movie2.getName();
		assertEquals("Toy Story", movieName2);
	}

}
