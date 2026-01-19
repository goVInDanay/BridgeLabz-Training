package dsa_practice.gcr_codebase.algorithm_runtime_analysis;

public class StringComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		long builderStartTime = System.nanoTime();
		for(long i = 0; i < 1000000; i++) {
			sb.append("1000");
		}
		long builderEndTime = System.nanoTime();
		System.out.println("Builder time: " + (builderEndTime - builderStartTime));
		StringBuffer sbf = new StringBuffer();
		long bufferStartTime = System.nanoTime();
		for(long i = 0; i < 1000000; i++) {
			sbf.append("1000");
		}
		long bufferEndTime = System.nanoTime();
		System.out.println("Buffer time: " + (bufferEndTime - bufferStartTime));
		String s = "";
		long stringStartTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			s = s + "1000";
		}
		long stringEndTime = System.nanoTime();
		System.out.println("Builder time: " + (stringEndTime - stringStartTime));

	}

}
