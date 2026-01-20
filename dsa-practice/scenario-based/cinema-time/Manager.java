package dsa_practice.scenario_based.cinema_time;

import java.util.*;

class Manager {
	List<Movie> movies = new ArrayList<Movie>();

	public void addMovie(String title, String time) throws InvalidTimeFormatException {
		validateTime(time);
		movies.add(new Movie(title, time));
	}

	private void validateTime(String time) throws InvalidTimeFormatException {

		if (time.length() != 5 || time.charAt(2) != ':') {
			throw new InvalidTimeFormatException("Invalid Time Format");
		}

		int hours = Integer.parseInt(time.substring(0, 2));
		int minutes = Integer.parseInt(time.substring(3, 5));

		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
			throw new InvalidTimeFormatException("Invalid Time");
		}
	}

	public void searchMovie(String keyword) {
		boolean found = false;
		for (Movie movie : movies) {
			if (movie.getTitle().contains(keyword)) {
				System.out.println(movie.formattedMovie());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No movies found");
		}
		System.out.println();
	}

	public void displayAllMovie() {
		System.out.println("Movies: ");
		for (Movie movie : movies) {
			System.out.println(movie.formattedMovie());
		}
		System.out.println();
	}

	public void printReport() {
		Movie movieArr[] = movies.toArray(new Movie[0]);
		for (Movie movie : movieArr) {
			System.out.println(movie.formattedMovie());
		}
		System.out.println();
	}
}
