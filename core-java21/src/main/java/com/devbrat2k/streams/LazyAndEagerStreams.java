package com.devbrat2k.streams;

import com.devbrat2k.domain.Movie;
import com.devbrat2k.util.MovieUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class demonstrates the lazy and eager characteristics of streams
 * 
 * @author mkonda
 *
 */
public class LazyAndEagerStreams {
	List<Movie> movies = MovieUtil.createMovies();

	/**
	 * Lazy intermediate operations
	 */
	private void lazyIntermediateOperator() {
		
		// The filter is never executed 
		Stream<Movie> movieStream = movies
		  .stream()
		  .filter(m -> {
			 System.out.println("Lazy operation");
			 return m.isClassic();
		 }).limit(2);
		
		// Unless we add a terminal operator - uncomment and rerun
		// movieStream.forEach(System.out::println);
	}
	/**
	 *  Eager terminal operations
	 */
	private void eagerTerminalOperator() {
		Stream<Movie> movieStream = movies.stream().filter(m -> {
					System.out.println("Filtering");
					return m.isClassic();
				})
				.map(s -> {
					System.out.println("Mapping");
					return s;
				});
		Map<String, List<Movie>> moviesByDirectors  = movies.stream()
				.collect(Collectors.groupingBy(Movie::getDirector));
		Map<String, String> moviesDirectorMap  =
				movieStream.collect(Collectors.toMap(Movie:: getName, Movie::getName));
		Set<Movie> moviesSortedSet = movies.stream().sorted((m1,m2)-> m1.getName()
				.compareToIgnoreCase(m2.getName())).collect(Collectors.toSet());

		System.out.println(moviesByDirectors);
		System.out.println(moviesDirectorMap);
		System.out.println(moviesSortedSet);

//			.forEach(System.out::println);
//			.collect(Collectors.toList());
			
	}

	public static void main(String[] args) {
//		new LazyAndEagerStreams().lazyIntermediateOperator();
		new LazyAndEagerStreams().eagerTerminalOperator();
	}

}
