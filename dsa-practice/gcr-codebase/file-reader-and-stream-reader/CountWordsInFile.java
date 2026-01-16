package dsa_practice.gcr_codebase.file_reader_and_stream_reader;
import java.io.*;

public class CountWordsInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "fileName.txt";
		String target = "fine";
		int count = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line;
			while((line = br.readLine()) != null) {
				String words[] = line.split(" ");
				for(String word : words) {
					if(word.equalsIgnoreCase(target)) {
						count++;
					}
				}
			}
			System.out.println("Target word: " + target + " appeared: " + count + " times");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
