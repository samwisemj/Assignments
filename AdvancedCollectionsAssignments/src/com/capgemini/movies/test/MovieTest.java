package com.capgemini.movies.test;

import com.capgemini.movies.classes.MovieDetailsList;

public class MovieTest {

	public static void main(String[] args) {
	
		/*1.Sort the movies by movie name 
		 * 2.Sort the movies by actor name
		 * 3.Sort the movies by actress name
		 * 4.or others Sort movies by genre 
		 */
		MovieDetailsList list=new MovieDetailsList(1);
		
		list.add_movie("Black", "Amitabh", "Rani Mukherjee", "Drama");
		list.add_movie("Rambo", "Stallon", "none", "Action");
		list.add_movie("Avengers", "Robert Downy", "none", "Action");
		list.add_movie("Iron Man", "Robert Downy", "none", "Action");
		
		list.findMovieGenre("DRAMA");
		
		list.remove_movie("Black");
		list.removeAllMovies();
		list.findMovieGenre("DRAMA");
		list.display();
		
	}

}
