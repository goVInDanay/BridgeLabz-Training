package dsa_practice.gcr_codebase.linked_list;

import java.time.Year;

class MovieNode {
	String movieTitle;
	String director;
	int yearOfRelease;
	double rating;
	MovieNode prev = null;
	MovieNode next = null;

	MovieNode() {
	}

	MovieNode(String movieTitle, String director, int yearOfRelease, double rating) {
		this.movieTitle = movieTitle;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
	}
}

class MovieList {
	MovieNode head = null;
	MovieNode tail = null;
	int size = 0;

	public void addMovieAtStart(String movieTitle, String director, int yearOfRelease, double rating) {
		MovieNode node = new MovieNode(movieTitle, director, yearOfRelease, rating);
		if (head == null) {
			head = tail = node;
			size++;
			System.out.println("Movie added");
			return;
		}
		node.next = head;
		head.prev = node;
		head = node;
		System.out.println("Movie added");
		size++;
	}

	public void addMovieAtEnd(String movieTitle, String director, int yearOfRelease, double rating) {
		MovieNode node = new MovieNode(movieTitle, director, yearOfRelease, rating);
		if (head == null) {
			head = tail = node;
			size++;
			System.out.println("Movie added");
			return;
		}
		node.prev = tail;
		tail.next = node;
		tail = node;
		System.out.println("Movie added");
		size++;
	}

	public void addMovieAtPostition(int idx, String movieTitle, String director, int yearOfRelease, double rating) {
		if (idx <= 0 || idx > size + 1) {
			System.out.println("Invalid position");
			return;
		}
		if (idx == 1) {
			addMovieAtStart(movieTitle, director, yearOfRelease, rating);
			return;
		}
		if (idx == size + 1) {
			addMovieAtEnd(movieTitle, director, yearOfRelease, rating);
			return;
		}

		int pos = 1;
		MovieNode temp = head;
		while (pos < idx - 1 && temp != null) {
			temp = temp.next;
			pos++;
		}
		MovieNode node = new MovieNode(movieTitle, director, yearOfRelease, rating);
		node.next = temp.next;
		node.prev = temp;
		temp.next.prev = node;
		temp.next = node;
		size++;
		System.out.println("Movie added");
	}

	public void deleteByMovieTitle(String movieTitle) {
		if (head == null) {
			System.out.println("Movie List is empty");
			return;
		}
		MovieNode temp = head;
		while (temp != null) {
			if (temp.movieTitle.equalsIgnoreCase(movieTitle)) {
				if (head == tail) {
					head = tail = null;
				} else if (temp == head) {
					head = head.next;
					head.prev = null;
				} else if (temp == tail) {
					tail = tail.prev;
					tail.next = null;
				} else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}
				size--;
				System.out.println("Movie deleted");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie not found");
	}

	public void searchByDirector(String director) {
		if (head == null) {
			System.out.println("Movie List is empty");
			return;
		}
		MovieNode temp = head;
		boolean flag = false;
		while (temp != null) {
			if (temp.director.equalsIgnoreCase(director)) {
				flag = true;
				System.out.println("Movie Name: " + temp.movieTitle + "\nDirector: " + temp.director
						+ "\nRelease Year: " + temp.yearOfRelease + "\nRating: " + temp.rating);	
			}
			temp = temp.next;
		}
		if(!flag) {
			System.out.println("Movie Not Found");
		}
		System.out.println();
	}
	
	public void searchByRating(double rating) {
		if (head == null) {
			System.out.println("Movie List is empty");
			return;
		}
		MovieNode temp = head;
		boolean flag = false;
		while (temp != null) {
			if (temp.rating == rating) {
				flag = true;
				System.out.println("Movie Name: " + temp.movieTitle + "\nDirector: " + temp.director
						+ "\nRelease Year: " + temp.yearOfRelease + "\nRating: " + temp.rating);	
			}
			temp = temp.next;
		}
		if(!flag) {
			System.out.println("Movie Not Found");
		}
		System.out.println();
	}
	
	public void displayForward() {
	    MovieNode temp = head;
	    while (temp != null) {
	        System.out.println(temp.movieTitle + "\n" + temp.director + "\n" +
	                           temp.yearOfRelease + "\n" + temp.rating);
	        System.out.println();
	        temp = temp.next;
	    }
	    System.out.println();
	}

	public void displayReverse() {
	    MovieNode temp = tail;
	    while (temp != null) {
	        System.out.println(temp.movieTitle + "\n" + temp.director + "\n" +
	                           temp.yearOfRelease + "\n" + temp.rating);
	        System.out.println();
	        temp = temp.prev;
	    }
	    System.out.println();
	}
	
	public void updateRatingByTitle(String movieTitle, double rating) {
		if(head == null) {
			System.out.println("Movie List is Empty");
			return;
		}
		
		MovieNode temp = head;
		while(temp != null) {
			if(temp.movieTitle.equalsIgnoreCase(movieTitle)) {
				temp.rating = rating;
				System.out.println("Movie Rating Updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie Not Found");
		
	}
}

public class MovieManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieList movies = new MovieList();

		movies.addMovieAtEnd("Lord Of The Rings", "Tolkien", 2001, 9.8);
		movies.addMovieAtEnd("Interstellar", "Nolan", 2014, 8.6);
		movies.searchByDirector("Nolan");
		movies.searchByRating(9.8);
		movies.updateRatingByTitle("Interstellar", 9.0);
		System.out.println("Display Forward");
		movies.displayForward();
		System.out.println("Display Reverse");
		movies.displayReverse();
		movies.deleteByMovieTitle("Interstellar");
		movies.displayForward();
		movies.deleteByMovieTitle("Lord Of The Rings");
		movies.displayForward();
		movies.deleteByMovieTitle("Lord Of The Rings");
	}

}
