package com.devbrat2k.introduction;

import com.devbrat2k.domain.Movie;
import com.devbrat2k.domain.Trade;
import com.devbrat2k.util.MovieUtil;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * This class defines few lambda expressions.
 * @author mkonda
 *
 */
public class Examples {

	/**
	 *  A callable lambda
	 */
	
	Callable<Trade> c = () -> {
		Trade t = new Trade("GOOGLE", 2000, "OPEN");
		encrypt(t);
		persist(t);
		return t;
	};

	/**
	 * fetching movies directed by a specific director
	 * 
	 * @param movies
	 * @param director
	 */
	private void fetchMovies(List<Movie> movies, String director) {
		movies
		  .stream()
		  .filter(m -> m.getDirector().equals(director))
		  .map(Movie::getName)
		  .distinct()
		  .forEach(System.out::println);
	}

	public static void main(String[] args) {
	
		List<Movie> movies = MovieUtil.createMovies();
		new Examples().fetchMovies(movies, "Steven Spielberg");
	}

	private void persist(Trade t) {
		System.out.println("Persisting the trade ..");
	}

	private void encrypt(Trade t) {
		System.out.println("Encrypting the trade..");
	}

}
