package core_java_practice.scenario_based;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class RohanLibraryReminderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
		int finePerDay = 5;
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter due date");
			String inputDueDate = sc.nextLine();
			System.out.println("Enter return date");
			String inputDate = sc.nextLine();
			LocalDate dueDate = LocalDate.parse(inputDueDate, formatter);
			LocalDate returnDate = LocalDate.parse(inputDate, formatter);
			if(returnDate.isAfter(dueDate)) {
				long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
				long fine = daysLate * finePerDay;
				System.out.println("Late by " + daysLate + " days");
				System.out.println("Fine Rs " + fine);
			}
			else {
				System.out.println("Returned by due date");
			}
		}
	}

}
