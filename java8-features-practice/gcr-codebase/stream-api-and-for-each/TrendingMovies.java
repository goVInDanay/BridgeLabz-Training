package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.util.List;

class Movie {
	String title;
	double rating;
	int year;

	Movie(String title, double rating, int year) {
		this.title = title;
		this.rating = rating;
		this.year = year;
	}

	@Override
	public String toString() {
		return title + " | Rating: " + rating + " | Release Year: " + year;
	}
}

public class TrendingMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movies = List.of(new Movie("Inception", 8.8, 2010), new Movie("Avengers: Endgame", 8.4, 2019),
				new Movie("The Dark Knight", 9.0, 2008), new Movie("Parasite", 8.6, 2019),
				new Movie("Interstellar", 8.6, 2014), new Movie("Joker", 8.5, 2019), new Movie("1917", 8.3, 2019),
				new Movie("Tenet", 7.5, 2020));
		List<Movie> trending = movies.stream().filter(movie -> movie.rating > 8).sorted((m1, m2) -> {
			int rating = Double.compare(m2.rating, m1.rating);
			return rating != 0 ? rating : Integer.compare(m2.year, m1.year);
		}).limit(5).toList();
		trending.forEach(System.out::println);
	}

}
