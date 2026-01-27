package collections.gcr_codebase.exception_handling;

import java.io.*;

public class CatchIOException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}

}
