package com.ait.moviestore;

import java.util.Calendar;
import java.util.Date;

import com.ait.dvd.Dvd;

/**
 * Class used to store information about a DVD which has been rented to a customer.
 */
public class DvdRental {

	private static final long TWENTY_FOUR_HOURS_MILLISEC = 24 * 60 * 60 * 1000;

	private static final int SEVEN_PM = 19;

	private final Date dueDate;

	private final Account account;

	private final Dvd rentedDvd;

	/**
	 * Create a new DVD Rental agreement.
	 * @param account the account which is renting the DVD.
	 * @param rentedDvd the DVD which is being rented.
	 */
	public DvdRental(final Account account, final Dvd rentedDvd) {
		this.account = account;
		this.rentedDvd = rentedDvd;
		this.dueDate = calculateDueDate();
	}

	private Date calculateDueDate() {
		final Calendar calendar = Calendar.getInstance();
		adjustTimeBy24Hours(calendar);
		setTimeToReturnTime(calendar);
		return calendar.getTime();
	}

	private void setTimeToReturnTime(final Calendar calendar) {
		final int returnTimeInHours = SEVEN_PM;
		calendar.set(Calendar.HOUR_OF_DAY, returnTimeInHours);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
	}

	private void adjustTimeBy24Hours(final Calendar calendar) {
		calendar.setTimeInMillis(System.currentTimeMillis()
				+ TWENTY_FOUR_HOURS_MILLISEC);
	}

}
