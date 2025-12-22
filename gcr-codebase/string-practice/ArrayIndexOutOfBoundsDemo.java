import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
	private static void indexOutOfBoundsGeneration(String names[]) {
		System.out.println(names[names.length]);
	}
	private static void handleException(String names[]) {
		try {
			System.out.println(names[names.length]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " exception handled");
		}
		catch(Exception e) {
			System.out.println(e + " exception handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String names[] = new String[5];
		System.out.println("Enter 5 names");
		for(int i = 0; i < 5; i++) {
			names[i] = sc.next();
		}
//		System.out.println("Exception -> ");
//		indexOutOfBoundsGeneration(names);
		System.out.println("Exception handler -> ");
		handleException(names);
	}

}
