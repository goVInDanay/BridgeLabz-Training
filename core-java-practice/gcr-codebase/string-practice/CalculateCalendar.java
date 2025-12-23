import java.util.*;
public class CalculateCalendar {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        display(month, year);

	}
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getDays(int month, int year) {
        if(month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }
    public static int getFirstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }
    public static void display(int month, int year) {
        System.out.println(months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDay(month, year);
        int days = getDays(month, year);
        for(int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for(int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

}
