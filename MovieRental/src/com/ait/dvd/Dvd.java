package com.ait.dvd;

public class Dvd {

	private final String title;
	private boolean isRented = false;
	private static DvdType dvdType = DvdType.NEW_RELEASE;
	private static final int chargePerDay=50;

	/**
	 * Create a new DVD with the supplied title.
	 * @param title the title of the DVD.
	 */
	public Dvd(final String title, final DvdType dvdType) {
		this.title = title;
		this.dvdType=dvdType;
	}


	/**
	 * Mark that this DVD is not in the store, and so is NOT available for rent.
	 */
	public void rentToAccountHolder() {
		this.isRented = true;
	}


	/**
	 * Get the charge to rent this DVD per day.
	 * <p>
	 * The charge per day varies according to the DVD type, and 
	 * so is implemented in the sub-classes.
	 * @return the charge per day, in cents.
	 */
	public int getChargePerDay(){
		return chargePerDay;
	}

}
