package core_java_practice.gcr_codebase.extras;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		System.out.println("Format 1 " + date.format(formatter1));
		System.out.println("Format 2 " + date.format(formatter2));
		System.out.println("Format 3 " + date.format(formatter3));
	}

}
