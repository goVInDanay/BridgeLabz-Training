import java.util.*;
public class ComputePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		String[][] data = calculateGrade(n);
		display(data);
	}	
	private static double[][] calculateMarks(int n) {
		double marks[][] = new double[n][3];
		for(int i = 0; i < n; i++) {
			double phy = Math.random() * (100 - 10) + 10;
			phy = Math.round(phy * 100.0) / 100.0;
			double chem = Math.random() * (100 - 10) + 10;
			chem = Math.round(chem * 100.0) / 100.0;
			double maths = Math.random() * (100 - 10) + 10;
			maths = Math.round(maths * 100.0) / 100.0;
			marks[i][0] = phy;
			marks[i][1] = chem;
			marks[i][2] = maths;
		}
		return marks;
	}
	
	private static double[][] calculateData(int n) {
		double marks[][] = calculateMarks(n);
		double data[][] = new double[n][6];
		for(int i = 0; i < marks.length; i++) {
			double total = 0;
			for(int j = 0; j < 3; j++) {
				total += marks[i][j];
				data[i][j] = marks[i][j];
			}
			total = Math.round(total * 100.0) / 100.0;
			double average = total / 300;
			average = Math.round(average * 100) / 100.0;
			double percentage = average * 100;
			percentage = Math.round(percentage * 100.0) / 100.0;
			data[i][3] = total;
			data[i][4] = average;
			data[i][5] = percentage;
		}
		return data;
	}
	
	private static String[][] calculateGrade(int n){
		double arr[][] = calculateData(n);
		String data[][] = new String[n][7];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				data[i][j + 1] = String.valueOf(arr[i][j]);
			}
			if(arr[i][5] >= 80) {
				data[i][0] = "A";
			}
			else if(arr[i][5] >= 70 && arr[i][5] < 80) {
				data[i][0] = "B";
			}
			else if(arr[i][5] >= 60 && arr[i][5] < 70) {
				data[i][0] = "C";
			}
			else if(arr[i][5] >= 50 && arr[i][5] < 60) {
				data[i][0] = "D";
			}
			else if(arr[i][5] >= 40 && arr[i][5] < 50) {
				data[i][0] = "E";
			}
			else{
				data[i][0] = "R";
			}
		}
		return data;
	}
	private static void display(String data[][]) {
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j] + " ");	
			}
			System.out.println();
		}
	}
}
