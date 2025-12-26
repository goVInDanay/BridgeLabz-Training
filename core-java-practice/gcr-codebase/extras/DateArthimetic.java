package core_java_practice.gcr_codebase.extras;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateArthimetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a date (dd-MM-yyyy)");
		String inputDate = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(inputDate, formatter);
		LocalDate plusDay = date.plusDays(7);
		LocalDate plusMonth = plusDay.plusMonths(1);
		LocalDate plusYear = plusMonth.plusYears(2);
		LocalDate minusWeek = plusYear.minusWeeks(3);
		System.out.println("Final Date " + minusWeek);
	}

}
