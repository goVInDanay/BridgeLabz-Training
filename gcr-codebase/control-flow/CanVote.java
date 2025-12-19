import java.util.*;
public class CanVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("The person age is + " + age + " and can vote");
		}
		else {
			System.out.println("The person age is + " + age + " and cannot vote");
		}
	}

}
