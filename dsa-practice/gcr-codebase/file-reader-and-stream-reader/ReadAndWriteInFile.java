package dsa_practice.gcr_codebase.file_reader_and_stream_reader;
import java.io.*;

public class ReadAndWriteInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "ileName.txt";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Enter text or exit to stop");
			String input;
			while(true) {
				input = br.readLine();
				if(input.equalsIgnoreCase("exit")) {
					break;
				}
				bw.write(input);
				bw.newLine();
				bw.flush();
			}
			System.out.println("Wrote successfully");
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
