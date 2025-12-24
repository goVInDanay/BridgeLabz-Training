package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class StudentVoteChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ages[] = new int[10];
		for(int i = 0; i < 10; i++) {
			ages[i] = sc.nextInt();
		}
		StudentVoteChecker svc = new StudentVoteChecker();
		for(int age : ages) {
			if(svc.canStudentVote(age)) {
				System.out.println("Can Vote");
			}
			else {
				System.out.println("Cannot Vote");
			}
		}
	}
	public boolean canStudentVote(int age) {
		if(age < 0) {
			System.out.print("Invalid age -> ");
			return false;
		}
		if(age >= 18) {
			return true;
		}
		return false;
	}

}
