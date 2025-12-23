import java.util.*;
public class MaxHandshakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int numberOfStudents = sc.nextInt();
		int total = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.println("Number of possible handshakes " + total);
	}

}
