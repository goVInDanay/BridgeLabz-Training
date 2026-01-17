package dsa_practice.gcr_codebase.file_reader_and_stream_reader;

import java.io.*;

public class ComparePerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "hello";
		long startBuilderTime = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(text);
		}
		long endBuilderTime = System.nanoTime();
		System.out.println("StringBuilder time: " + (endBuilderTime - startBuilderTime));

		long startBufferTime = System.nanoTime();
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < 1000000; i++) {
			sbf.append(text);
		}
		long endBufferTime = System.nanoTime();

		System.out.println("StringBuffer time: " + (endBufferTime - startBufferTime));

		String path = "fileName.txt";
		;

		try {
			FileReader fr = new FileReader(path); 
			BufferedReader br = new BufferedReader(fr);
			long startFR = System.nanoTime();
			long wordCountFR = 0;
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split(" ");
				wordCountFR += words.length;
			}
			long endFR = System.nanoTime();

			System.out.println("FileReader word count: " + wordCountFR);
			System.out.println("FileReader time: " + (endFR - startFR) + " ms");

		} catch (IOException e) {
			System.out.println(e);
		}

		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

			long startISR = System.nanoTime();
			long wordCountISR = 0;
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split(" ");
				wordCountISR += words.length;
			}
			long endISR = System.nanoTime();
			System.out.println("InputStreamReader word count: " + wordCountISR);
			System.out.println("InputStreamReader time: " + (endISR - startISR) + " ms");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
