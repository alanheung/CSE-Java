package com.ait.moviecatalog;

public class Movie {

	private String title;
	private String rating;
	private Boolean onLoan;
	private String genre;
	
	public Movie(){
		title="";
		rating="";
		onLoan=false;
	}
	
	/**
	 * @param title
	 * @param rating
	 * @param onLoan
	 */
	public Movie(String title, String rating, Boolean onLoan,String genre){
		this.title=title;
		this.rating=rating;
		this.onLoan=onLoan;
		this.genre=genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Boolean getOnLoan() {
		return onLoan;
	}

	public void setOnLoan(Boolean onLoan) {
		this.onLoan = onLoan;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
