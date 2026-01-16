package dsa_practice.gcr_codebase.file_reader_and_stream_reader;

import java.io.*;

public class ConvertByteToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "fileName.txt";
		String encoding = "UTF-8";
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, encoding);
			BufferedReader br = new BufferedReader(isr);
			String line;
			while((line = br.readLine()) != null) {
				System.out.print(line);
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
