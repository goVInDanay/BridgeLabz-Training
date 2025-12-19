import java.util.*;
public class FindPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		double marks1 = sc.nextDouble();
		double marks2 = sc.nextDouble();
		double marks3 = sc.nextDouble();
		double sum = marks1 + marks2 + marks3;
		double percentage = (sum * 100) / 300;
		if(percentage >= 80) {
			System.out.println("Grade A, Level 4 above agency-normalized standards, Average " + percentage);
		}
		else if(percentage >= 70 &&  percentage <= 79) {
			System.out.println("Grade B, Level 3 at agency-normalized standards, Average " + percentage);
		}
		else if(percentage >= 60 && percentage <= 69) {
			System.out.println("Grade C, Level 2 below but approaching agency-normalized standards, Average " + percentage);
		}
		else if(percentage >= 50 && percentage <= 59) {
			System.out.println("Grade D, Level 1 well below agency-normalized standards, Average " + percentage);
		}
		else if(percentage >= 40 && percentage <= 49) {
			System.out.println("Grade E, Level 1- too below agency-normalized standards, Average " + percentage);
		}
		else {
			System.out.println("Grade R, Remedial Standards , Average " + percentage);
		}
	}

}
