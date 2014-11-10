package com.ait.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ait.moviecatalog.*;

public class MovieCatalogTest {
	
	MovieCatalog catalog;
	Movie movie;
	
	@Before
	public void initialize(){
		catalog = new MovieCatalog();
	}
	
	@Test
	public void testConstructor(){
		
	}
	
	@Test
	public void testAddMovie(){
		movie = new Movie("End Of Watch", "10/10", false,"Action");
		catalog.addMovie(movie);
		assertEquals(1,catalog.getNumberOfMovies());
	}
	
	@Test
	public void testRemoveMovie(){
		movie = new Movie("End Of Watch", "10/10", false,"Action");
		catalog.addMovie(movie);
		assertEquals(1,catalog.getNumberOfMovies());
		catalog.deleteMovie(movie);
		assertEquals(0,catalog.getNumberOfMovies());
	}
	
	@Test
	public void testFindMovie(){
		movie = new Movie("End Of Watch", "10/10", false,"Action");
		catalog.addMovie(movie);
		assertEquals(true,catalog.findMovie(movie));
		movie = new Movie("The Fifth Element", "8/10", true,"Action");
		assertEquals(false,catalog.findMovie(movie));
	}
	
	@Test
	public void testSearchMovieByName(){
		movie = new Movie("End Of Watch", "10/10", false,"Action");
		catalog.addMovie(movie);
		movie = new Movie("The Fifth Element", "8/10", true,"Action");
		catalog.addMovie(movie);
		movie = new Movie("Interstellar", "9/10", false,"Drama");
		catalog.addMovie(movie);
		assertEquals(true,catalog.searchMovieByName("Interstellar"));
		assertEquals(false,catalog.searchMovieByName("The Muppets"));
	}
	
	@Test
	public void testSearchByGenre(){
		movie = new Movie("End Of Watch", "10/10", false,"Action");
		catalog.addMovie(movie);
		movie = new Movie("The Fifth Element", "8/10", true,"Action");
		catalog.addMovie(movie);
		movie = new Movie("Interstellar", "9/10", false,"Drama");
		catalog.addMovie(movie);
		assertEquals(2,catalog.searchByGenre("Action"));
		assertEquals(1,catalog.searchByGenre("Drama"));
		assertEquals(0,catalog.searchByGenre("Animated"));
	}
	
	@Test
	public void testRentReturnMovie(){
		movie = new Movie("End Of Watch", "10/10", false,"Action");
		catalog.addMovie(movie);
		catalog.rentMovie(movie);
		assertEquals(true,catalog.isMovieRented(movie));
		catalog.returnMovie(movie);
		assertEquals(false,catalog.isMovieRented(movie));
	}
	
}
