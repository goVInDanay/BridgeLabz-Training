package review.library_management_system;

public class LibraryManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member("Govind", "Student");
		Member member2 = new Member("Akash", "Staff");
		Transaction transaction1 = new Transaction(member1);
		Transaction transaction2 = new Transaction(member2);
		
		Book book1 = new Book("Lord of The Rings", "JRR Tolkien");
		Book book2 = new Book("Harry Potter", "JK Rowling");
		Book book3 = new Book("One Piece", "Eiichiro Oda");
		try {
			transaction1.issueBook(book3);
			transaction1.issueBook(book1);
			transaction2.issueBook(book2);
			transaction1.issueBook(book3);
		}
		catch (BookNotAvailableException e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
		FineCalculator studentFine = new StudentFineCalculation();
		FineCalculator staffFine = new StaffFineCalculation();
		if(transaction1.getMember().getRole().equalsIgnoreCase("Student")) {	
			transaction1.returnBook(book3, 10, studentFine);
		}
		
		if(transaction1.getMember().getRole().equalsIgnoreCase("Student")) {	
			transaction1.returnBook(book1, 15, studentFine);
		}
		
		if(transaction2.getMember().getRole().equalsIgnoreCase("Staff")) {	
			transaction2.returnBook(book2, 11, staffFine);
		}
		
	}

}
