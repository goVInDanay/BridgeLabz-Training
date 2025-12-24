package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int marks[][] = new int[n][3];
		for(int i = 0; i < n; i++) {
			marks[i] = getScore();
		}
		double data[][] = getTotalAveragePercentage(marks);
		display(data);
	}
	public static int[] getScore(){
		int phy = (int)(Math.random() * 90) + 10;
		int chem = (int)(Math.random() * 90) + 10;
		int maths = (int)(Math.random() * 90) + 10;
		return new int[] {phy, chem, maths};
	}
	public static double[][] getTotalAveragePercentage(int [][]marks){
		double data[][] = new double[marks.length][6];
		for(int i = 0; i < marks.length; i++) {
			double total = 0;
			for(int j = 0; j < marks[0].length; j++) {
				data[i][j] = marks[i][j];
				total += marks[i][j];
			}
			total = Math.round(total * 100) / 100;
			data[i][3] = total;
			data[i][4] = Math.round((total / (marks[0].length * 100)) * 100) / 100;
			data[i][5] = Math.round((data[i][4] * 100) * 100) / 100;
		}
		return data;
	}
	public static void display(double data[][]) {
		System.out.println("Phy\tChem\tMaths\tTotal\tAvg\tPercentage");
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t" + data[i][3] + "\t" + data[i][4] + "\t" + data[i][5]);
		}
	}
}
