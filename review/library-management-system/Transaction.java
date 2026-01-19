package review.library_management_system;

class Transaction {
	private Member member;
	private Book issued[];
	private int countIssued;

	Transaction(Member member) {
		registerMember(member);
		issued = new Book[3];
		countIssued = 0;
	}

	public void registerMember(Member member) {
		this.member = member;
		System.out.println(member.getName() + " registered");
	}

	public Member getMember() {
		return member;
	}
	
	public void issueBook(Book book) throws BookNotAvailableException {
		if (countIssued > 3) {
			System.out.println("Cannot issue more than 3 books at a time. Please return a book to continue");
			return;
		}
		if (!book.isAvailable()) {
			throw new BookNotAvailableException(book.getTitle() + ": Book not available at the moment");
		}
		book.issueBook();
		issued[countIssued++] = book;
		System.out.println(book.getTitle() + " issued successfully");
	}

	public void returnBook(Book issuedBook, int days, FineCalculator fineCalculator) {
		for (int i = 0; i < 3; i++) {
			if (issued[i] == issuedBook) {
				for (int j = i; j < 2; j++) {
					issued[j] = issued[j + 1];
				}
				issuedBook.returnBook();
				System.out.println(issuedBook.getTitle() + " returned successfully");
				fineCalculator.calculateFine(days);
				return;
			}
		}
		System.out.println("No such book issued");
	}
}
