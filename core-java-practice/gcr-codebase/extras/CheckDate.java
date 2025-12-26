package core_java_practice.gcr_codebase.extras;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class CheckDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter 2 dates (dd-MM-yyyy)");
		String inputDate = sc.nextLine();
		String inputDate2 = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date1 = LocalDate.parse(inputDate, formatter);
		LocalDate date2 = LocalDate.parse(inputDate2, formatter);
		if(date1.isBefore(date2)) {
			System.out.println("Date 1 is before Date 2");
		}
		else if(date1.isAfter(date2)) {
			System.out.println("Date 1 is after Date 2");
		}
		else if(date1.isEqual(date2)) {
			System.out.println("Date 1 is equal to Date 2");
		}
	}

}
