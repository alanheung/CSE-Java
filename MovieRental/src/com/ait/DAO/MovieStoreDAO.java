package com.ait.DAO;

import com.ait.dvd.Dvd;
import com.ait.moviestore.Account;
import com.ait.moviestore.DvdRental;

public interface MovieStoreDAO {
	public Account findAccountForId(String accountId);
	public Dvd getAvailableDvdWithTitle(String title);
	public void createNewDvdRental(DvdRental dvdRental);
}
