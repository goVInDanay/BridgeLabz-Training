package review.library_management_system;

class Book {
	private String title;
	private String author;
	private boolean available;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.available = true;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isAvailable() {
		return available;
	}

	public void issueBook() {
		available = false;
	}

	public void returnBook() {
		available = true;
	}
}
