package dsa_practice.gcr_codebase.algorithm_runtime_analysis;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileComplexity {
	public static void main(String[] args) {
		String path = "fileName.txt";
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
			System.out.println("FileReader time: " + (endFR - startFR) + " ns");

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
			System.out.println("InputStreamReader time: " + (endISR - startISR) + "ns");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
