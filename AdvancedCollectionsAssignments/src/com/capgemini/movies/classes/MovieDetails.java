package com.capgemini.movies.classes;

public class MovieDetails implements Comparable<MovieDetails> {

	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;
	private static int constant;

	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor=" + leadActor + ", leadActress=" + leadActress
				+ ", genre=" + genre + "]";
	}

	public static void setConstant(int constant) {
		MovieDetails.constant = constant;
	}

	public MovieDetails(String movieName, String leadActor, String leadActress, String genre) {

		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((leadActor == null) ? 0 : leadActor.hashCode());
		result = prime * result + ((leadActress == null) ? 0 : leadActress.hashCode());
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDetails other = (MovieDetails) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (leadActor == null) {
			if (other.leadActor != null)
				return false;
		} else if (!leadActor.equals(other.leadActor))
			return false;
		if (leadActress == null) {
			if (other.leadActress != null)
				return false;
		} else if (!leadActress.equals(other.leadActress))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		return true;
	}

	@Override
	public int compareTo(MovieDetails arg0) {
		switch (constant) {
		case 1:
			return (this.getMovieName()).compareTo(arg0.getMovieName());

		case 2:
			return (this.getLeadActor()).compareTo(arg0.getLeadActor());

		case 3:
			return (this.getLeadActress()).compareTo(arg0.getLeadActress());

		default:
			return (this.getGenre()).compareTo(arg0.getGenre());

		}

	}
}
