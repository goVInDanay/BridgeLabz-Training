import java.util.*;

public class NullPointerDemo {
	private static void nullPointerGeneration() {
		String text = null;
		System.out.println(text.length());
	}
	private static void handleException() {
		String text = null;
		try {
			System.out.println(text.length());
		}
		catch(NullPointerException e) {
			System.out.println(e + " exception handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Null pointer exception -> ");
//		nullPointerGeneration();
		System.out.println("Null pointer handler -> ");
		handleException();
	}

}
