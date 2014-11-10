package com.ait.moviecatalog;

import java.util.ArrayList;

public class MovieCatalog {

	Movie movie;
	ArrayList<Movie> catalog = new ArrayList<Movie>();
	
	public MovieCatalog(){
		
	}
	
	public void addMovie(Movie movie){
		catalog.add(movie);
	}
	
	public void deleteMovie(Movie movie){
		catalog.remove(movie);
	}
	
	public int getNumberOfMovies(){
		return catalog.size();
	}
	
	public boolean findMovie(Movie movie){
		return catalog.contains(movie);
	}
	
	public boolean searchMovieByName(String name){
		for(Movie movie:catalog){
			if(movie.getTitle().equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public int searchByGenre(String genre){
		int total=0;
		for(Movie movie:catalog){
			if(movie.getGenre().equals(genre)){
				total++;
			}
		}
		return total;
	}
	
	public void rentMovie(Movie movie){
		movie.setOnLoan(true);
	}
	
	public void returnMovie(Movie movie){
		movie.setOnLoan(false);
	}
	
	public boolean isMovieRented(Movie movie){
		return movie.getOnLoan();
	}
}
