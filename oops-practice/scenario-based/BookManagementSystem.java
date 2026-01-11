package oops_practice.scenario_based;

import java.util.*;

class Book {
	private String title;
	private String author;
	private String genre;
	private int publishedYear;

	Book(String title, String author, String genre, int publishedYear) {
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setPublishedYear(publishedYear);
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setTitle(String title) {
		if (title == null || title.trim().isEmpty()) {
			throw new IllegalArgumentException("Title cannot be empty");
		}
		this.title = title.trim();
	}

	public void setAuthor(String author) {
		if (author == null || author.trim().isEmpty()) {
			throw new IllegalArgumentException("Author name cannot be empty");
		}
		this.author = author.trim();
	}

	public void setGenre(String genre) {
		if (genre == null || genre.trim().isEmpty()) {
			throw new IllegalArgumentException("Genre cannot be empty");
		}
		this.genre = genre.trim();
	}

	public void setPublishedYear(int year) {
		this.publishedYear = year;
	}
}

public class BookManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Lord of the Rings", "J.R.R Tolkien", "Fantasy", 1940));
		books.add(new Book("One Piece", "Eiichiro Oda", "Fantasy", 1997));
		books.add(new Book("Basic Java", "Govind", "Programming", 2003));
		books.add(new Book("Basic Python", "Akash", "Programming", 2005));
		books.add(new Book("History of India", "Hariom", "History", 2004));

		System.out.println("Books published after year 2000: ");
		books.stream().filter(book -> book.getPublishedYear() > 2000)
				.sorted(Comparator.comparing(book -> book.getTitle()))
				.forEach(book -> System.out.println(book.getTitle() + " : " + book.getAuthor()));
		System.out.println();
		List<String> seenGenres = new ArrayList<String>();
		System.out.println("Books by genre");
		for (Book book : books) {
			if (seenGenres.contains(book.getGenre())) {
				continue;
			}
			int count = 0;
			for (Book b : books) {
				if (b.getGenre().equalsIgnoreCase(book.getGenre())) {
					count++;
				}
			}
			System.out.println(book.getGenre() + " : " + count);
			seenGenres.add(book.getGenre());
		}
	}

}
