package com.ait.movies;

public class Movie {

	private String title;
	private String genre;
	private String rating;
	private boolean onLoan;
	
	public Movie(){
		title = "";
		genre = "";
		rating = "";
		onLoan = false;
	}
	public Movie(String title, String genre, String rating, boolean onLoan){
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.onLoan = onLoan;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public boolean isOnLoan() {
		return onLoan;
	}
	public void setOnLoan(boolean onLoan) {
		this.onLoan = onLoan;
	}
	
}
