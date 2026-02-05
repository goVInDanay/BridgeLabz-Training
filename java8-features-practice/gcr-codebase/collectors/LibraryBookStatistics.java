package java8_features_practice.gcr_codebase.collectors;

import java.util.*;
import java.util.stream.*;

class Book {
	String title;
	String genre;
	int pages;

	Book(String title, String genre, int pages) {
		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}

	public String getGenre() {
		return genre;
	}

	public int getPages() {
		return pages;
	}
}

public class LibraryBookStatistics {
	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("Book1", "Fiction", 300), new Book("Book2", "Fiction", 150),
				new Book("Book3", "Non-Fiction", 200), new Book("Book4", "Fiction", 400),
				new Book("Book5", "Non-Fiction", 100));

		Map<String, IntSummaryStatistics> statsByGenre = books.stream()
				.collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));

		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total Pages: " + stats.getSum());
			System.out.println("Average Pages: " + stats.getAverage());
			System.out.println("Max Pages: " + stats.getMax());
			System.out.println("Min Pages: " + stats.getMin());
			System.out.println();
		});
	}
}
