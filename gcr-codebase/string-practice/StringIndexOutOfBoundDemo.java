import java.util.Scanner;

public class StringIndexOutOfBoundDemo {
	private static void indexOutOfBoundGeneration(String s) {
		System.out.println(s.charAt(s.length()));
	}
	private static void handleException(String s) {
		try {
			System.out.println(s.charAt(s.length()));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e + " exception handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		System.out.println("Exception -> ");
//		indexOutOfBoundGeneration(s);
		System.out.println("Exception handler -> ");
		handleException(s);
	}

}
