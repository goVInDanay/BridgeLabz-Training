package collections.gcr_codebase.exception_handling;

public class ExceptionPropogationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method2();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Handled exception in main");
		}
	}

	public static void method1() {
		System.out.println(10 / 0);
	}

	public static void method2() {
		method1();
	}
}
