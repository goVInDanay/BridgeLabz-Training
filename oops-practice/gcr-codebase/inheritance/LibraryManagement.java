package oops_practice.gcr_codebase.inheritance;

class Book {
	private String title;
	private String publicationYear;

	Book(String title, String publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}

	void displayInfo() {
		System.out.println("Book title: " + title);
		System.out.println("Publication Year: " + publicationYear);
	}
}

class Author extends Book {
	private String name;
	private String bio;

	Author(String title, String publicationYear, String name, String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}

	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Author Name: " + name);
		System.out.println("Author Bio: " + bio);
	}
}

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("LOTR", "1940", "JRR Tolkien", "GOAT");
		a.displayInfo();
	}

}
