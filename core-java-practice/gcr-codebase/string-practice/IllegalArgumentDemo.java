import java.util.Scanner;

public class IllegalArgumentDemo {
	private static void illegalArgumentGeneration(String s) {
		System.out.println(s.substring(s.length() - 2, 0));
	}
	private static void handleException(String s) {
		try {
			System.out.println(s.charAt(s.length()));
		}
		catch(IllegalArgumentException e) {
			System.out.println(e + " exception handled");
		}
		catch(Exception e) {
			System.out.println(e + " exception handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		System.out.println("Exception -> ");
//		illegalArgumentGeneration(s);
		System.out.println("Exception handler -> ");
		handleException(s);
	}

}
