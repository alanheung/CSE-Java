package com.ait.movies;

import java.util.ArrayList;

public class MovieCatalog {
	private ArrayList<Movie> movieCtlg;

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MovieCatalog(){
		movieCtlg = new ArrayList<Movie>();
	}
	public void addMovie(Movie aMovie){
		movieCtlg.add(aMovie);
	}
	public int getNumberOfMovies(){
		return movieCtlg.size();
	}
	public void deleteMovie(Movie aMovie){
		movieCtlg.remove(aMovie);
	}
	public boolean searchMovieByName(String name){
		boolean movieFound=false;
		for(Movie theMovie: movieCtlg){
			if(theMovie.getTitle().equals(name)){
				movieFound=true;
			}
		}
		return movieFound;
	}
	public boolean findMovie(Movie aMovie){
		return movieCtlg.contains(aMovie);
	}
	public int findMovieWithGenre(String genre){
		int total =0;
		for(Movie theMovie: movieCtlg){
			if(theMovie.getGenre().equals(genre)){
				total++;
			}
		}
		return total;
	}
	public void rentMovie(Movie aMovie){
		aMovie.setOnLoan(true);
	}	
	public void	returnMovie(Movie aMovie){
		aMovie.setOnLoan(false);
	}
	public boolean isMovieRented(Movie movie){
		return movie.isOnLoan();
	}
	
}
