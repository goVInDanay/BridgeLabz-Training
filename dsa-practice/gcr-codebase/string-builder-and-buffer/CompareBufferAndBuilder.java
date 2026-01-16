package dsa_practice.gcr_codebase.string_builder_and_buffer;

public class CompareBufferAndBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		long builderStartTime = System.nanoTime();
		for(long i = 0; i < 1000000; i++) {
			sb.append("1000");
		}
		long builderEndTime = System.nanoTime();
		
		StringBuffer sbf = new StringBuffer();
		long bufferStartTime = System.nanoTime();
		for(long i = 0; i < 1000000; i++) {
			sbf.append("1000");
		}
		long bufferEndTime = System.nanoTime();
		System.out.println("Builder time: " + (builderEndTime - builderStartTime));
		System.out.println("Buffer time: " + (bufferEndTime - bufferStartTime));
	}

}
