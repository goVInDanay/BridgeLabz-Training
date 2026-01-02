package core_java_practice.scenario_based;

import java.util.*;

public class TemperatureAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float[][] weeklyTemperatures = new float[7][24];
		for (int i = 0; i < 7; i++) {
			System.out.println("Day " + (i + 1) + " Temperature ->");
			System.out.println();
			for (int j = 0; j < 24; j++) {
				System.out.println("Enter hour " + (j + 1) + " Temperature");
				weeklyTemperatures[i][j] = sc.nextFloat();
			}
		}
		int coldestDay = findColdestDay(weeklyTemperatures);
		int hottestDay = findHottestDay(weeklyTemperatures);
		float averageTemp[] = findAverageTemp(weeklyTemperatures);
		System.out.println("Coldest Day was: " + (coldestDay + 1));
		System.out.println("Hottest Day was: " + (hottestDay + 1));
		System.out.println("Weekly Temperatures: " + Arrays.toString(averageTemp));
	}

	private static int findColdestDay(float temperatures[][]) {
		int day = 0;
		float temp = Float.MAX_VALUE;
		// Find the coldest day by traversing through the array
		for (int i = 0; i < temperatures.length; i++) {
			for (float j : temperatures[i]) {
				if (j < temp) {
					temp = j;
					day = i;
				}
			}
		}
		return day;
	}

	private static int findHottestDay(float temperatures[][]) {
		int day = 0;
		float temp = 0;
		// Find the hottest day by traversing through the array
		for (int i = 0; i < temperatures.length; i++) {
			for (float j : temperatures[i]) {
				if (j > temp) {
					temp = j;
					day = i;
				}
			}
		}
		return day;
	}

	private static float[] findAverageTemp(float temperature[][]) {
		float averageTemp[] = new float[7];
		// Find the average temperature by traversing through the array
		for (int i = 0; i < temperature.length; i++) {
			float sum = 0;
			for (int j = 0; j < temperature[0].length; j++) {
				sum += temperature[i][j];
			}
			averageTemp[i] = sum / 24;
		}
		return averageTemp;
	}

}
