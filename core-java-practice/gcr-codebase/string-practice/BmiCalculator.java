import java.util.Scanner;
public class BmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double[][] input = new double[10][2];
        for(int i = 0; i < 10; i++) {
            input[i][0] = sc.nextDouble();
            input[i][1] = sc.nextDouble();
        }
        String[][] data = calculateBMI(input);
        display(data);
	}
    public static String[][] calculateBMI(double[][] arr) {
        String[][] data = new String[arr.length][4];
        for(int i = 0; i < arr.length; i++) {
            double weight = arr[i][0];
            double heightMeters = arr[i][1] / 100;
            double bmi = weight / (heightMeters * heightMeters);
            data[i][0] = String.valueOf(arr[i][1]);
            data[i][1] = String.valueOf(weight);
            data[i][2] = String.format("%.2f", bmi);
            data[i][3] = getStatus(bmi);
        }
        return data;
    }
    private static String getStatus(double bmi) {
        if(bmi < 18.5) {
        	return "Underweight";
        }
        if(bmi < 25) {
        	return "Normal";
        }
        if(bmi < 30) {
        	return "Overweight";
        }
        return "Obese";
    }
    public static void display(String[][] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1]+ " " +data[i][2] + " " + data[i][3]);
        }
    }

}
