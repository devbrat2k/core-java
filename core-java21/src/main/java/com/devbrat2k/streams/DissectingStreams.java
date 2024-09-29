package com.devbrat2k.streams;

import com.devbrat2k.domain.Movie;
import com.devbrat2k.util.MovieUtil;

import java.util.List;

/**
 * This class represents some of the functionality of streams
 * 
 * @author mkonda
 *
 */
public class DissectingStreams {

	List<Movie> movies = MovieUtil.createMovies();

	/**
	 * A method to find the movies directed by a specific director
	 * 
	 * @param director
	 */
	private void findMoviesByDirector(String director) {
		movies.stream()
		.filter(m-> m.getDirector().equals(director))
		.map(Movie::getName)
		.forEach(System.out::println);
	}


	public static void main(String[] args) {
		new DissectingStreams().findMoviesByDirector("Steven Spielberg");
	}

}
