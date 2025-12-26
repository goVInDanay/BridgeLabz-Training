package core_java_practice.gcr_codebase.methods;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.temporal.ChronoUnit;
public class DateTimePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter today's date (dd-MM-yyyy)");
		String inputDate = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(inputDate, formatter);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println("Day of the week " + dayOfWeek);
		LocalDate currentDate = LocalDate.now();
		long daysBetween = ChronoUnit.DAYS.between(date, currentDate);
		System.out.println("Days between input and current date " + daysBetween);
		LocalDateTime currentTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Current date and time " + currentTime.format(dateTimeFormatter));
	}

}
