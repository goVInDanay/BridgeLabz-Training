import java.util.Scanner;

public class NumberFormatDemo {
	private static void numberFormatGeneration(String s) {
		System.out.println(Integer.parseInt(s));
	}
	private static void handleException(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException e) {
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
//		numberFormatGeneration(s);
		System.out.println("Exception handler -> ");
		handleException(s);
	}

}
