package com.movie.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.movies.MovieCatalog;

public class MovieCatalogTest {

	@Test
	public void testCreate() {
		MovieCatalog movieCatalog = new MovieCatalog("SkyPlus");
		assertEquals("SkyPlus",movieCatalog.getName());
	}

}
