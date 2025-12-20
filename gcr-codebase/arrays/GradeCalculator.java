import java.util.*;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int physics[] = new int[n];
		int chemistry[] = new int[n];
		int maths[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter marks in physics then chemistry and then maths");
			physics[i] = sc.nextInt();
			chemistry[i] = sc.nextInt();
			maths[i] = sc.nextInt();
			if(physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
				System.err.println("Invalid marks. Enter again");
				i--;
				continue;
			}
		}
		for(int i = 0; i < n; i++) {
			double sum = physics[i] + chemistry[i] + maths[i];
			double percentage  = sum / 3;
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

}
