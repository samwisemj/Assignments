package com.capgemini.movies.classes;

import java.util.TreeSet;

public class MovieDetailsList {

	TreeSet<MovieDetails> treeSet;


	public MovieDetailsList(int constant) {
		
		MovieDetails.setConstant(constant);
		treeSet=new TreeSet<>();
	}

	// find movie by name
	public void findMovieName(String movieName) {

		int flag = 0;
		for (MovieDetails movie : treeSet) {

			if (movie.getMovieName().equalsIgnoreCase(movieName)) {
				System.out.println("Found\n" + movie);
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("Not Found");
		}
	}

	// remove all the movies from the collections
	public void removeAllMovies() {
		System.out.println("Removing all movies from list....This action cant be undone");
		treeSet.removeAll(treeSet);
	}

	// find movie by genre
	public void findMovieGenre(String genre) {

		int flag = 0;
		for (MovieDetails movie : treeSet) {

			if (movie.getGenre().equalsIgnoreCase(genre)) {
				System.out.println("Found\n" + movie);
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("Not Found");
		}
	}

	// lets assume we will remove the movie by movie name
	public void remove_movie(String movieName) {
		MovieDetails removeMovie = null;
		for (MovieDetails movie : treeSet) {
			if (movie.getMovieName().equalsIgnoreCase(movieName)) {
				System.out.println("Deleting--\n" + movie);
				removeMovie = movie;
			}
		}
		if (removeMovie != null)
			treeSet.remove(removeMovie);
		else
			System.out.println("Movie Not Present");
	}

	// add movie
	public void add_movie(String movieName, String leadActor, String leadActress, String genre) {
		treeSet.add(new MovieDetails(movieName, leadActor, leadActress, genre));
	}
	
	public void display ()
	{
		treeSet.stream().forEach((movie)->System.out.println(movie));
	}

}
