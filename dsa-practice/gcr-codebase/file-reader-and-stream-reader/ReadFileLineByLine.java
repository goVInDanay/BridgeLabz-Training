package dsa_practice.gcr_codebase.file_reader_and_stream_reader;
import java.io.*;

public class ReadFileLineByLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "fileName.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
