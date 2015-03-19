package com.ait.moviestore;
import com.ait.DAO.MovieStoreDAO;
import com.ait.dvd.Dvd;
import com.ait.exception.*;

public class MovieStoreImpl implements MovieStore {
	//private final String manager;
	private final MovieStoreDAO movieStoreDatabase;
	
	public MovieStoreImpl(final MovieStoreDAO movieStoreDatabase){
		this.movieStoreDatabase=movieStoreDatabase;
	}

	@Override
	public Dvd rentMovie(final String accountId, final String movieTitle) throws DvdStoreException {
		final Account account = movieStoreDatabase.findAccountForId(accountId);
		if (account != null && account.isAllowedToRentNewMovies()) {
			return rentMovieForValidAccount(movieTitle, account);
		} else {
			throw new DvdStoreUserException(accountId);
		}
	}

	private Dvd rentMovieForValidAccount(final String movieTitle,
			final Account account) throws DvdStoreException {
		final Dvd availableDvd= movieStoreDatabase.getAvailableDvdWithTitle(movieTitle);
		if (availableDvd != null) {
			createNewDvdRental(availableDvd, account);
			return availableDvd;
		} else {
			throw new DvdNotAvailable("DVD not available from this store: "+movieTitle);
		}
	}

	private void createNewDvdRental(final Dvd dvd,final Account account) {
		final DvdRental rental = new DvdRental(account, dvd);
		dvd.rentToAccountHolder();
		account.addCharge(dvd.getChargePerDay());
		movieStoreDatabase.createNewDvdRental(rental);
	}
}
