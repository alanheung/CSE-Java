package com.ait.moviestore;

import com.ait.dvd.Dvd;
import com.ait.exception.DvdStoreException;

public interface MovieStore {

	/**
	 * Rent a movie from this store.
	 * @param accountId the account ID of the user who wishes to rent the movie.
	 * @param movieTitle the title of the movie.
	 * @return the DVD disk which has been rented.
	 * @throws DvdStoreException if the DVD could not be rented.
	 */
	Dvd rentMovie(String accountId, String movieTitle) throws DvdStoreException;

}
