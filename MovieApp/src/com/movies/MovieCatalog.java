package com.movies;

public class MovieCatalog {

	private String movie;
	private String name;
	
	public MovieCatalog(String name) {
		this.name = name;
	}
	public String addMovie(String movie) {
		return movie;
	}
	public String removeMovie(String movie) {
		return movie="";
	}
	public void updateMovie() {
		this.movie=movie;
	}
	public String getName() {
		return name;
	}
}
