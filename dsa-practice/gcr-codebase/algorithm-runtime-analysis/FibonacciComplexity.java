package dsa_practice.gcr_codebase.algorithm_runtime_analysis;

public class FibonacciComplexity {
	public static int fibonacciRecursive(int n) {
	    if (n <= 1) return n;
	    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static int fibonacciIterative(int n) {
	    int a = 0, b = 1, sum;
	    for (int i = 2; i <= n; i++) {
	        sum = a + b;
	        a = b;
	        b = sum;
	    }
	    return b;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		long startTime = System.nanoTime();
		fibonacciIterative(n);
		long endTime = System.nanoTime();
		System.out.println("Time Taken: " + (endTime - startTime));
		startTime = System.nanoTime();
		fibonacciRecursive(n);
		endTime = System.nanoTime();
		System.out.println("Time Taken: " + (endTime - startTime));
	}

}
