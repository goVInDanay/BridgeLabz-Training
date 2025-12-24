package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class CalculateMathFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double angle = sc.nextDouble();
		CalculateMathFunctions cmf = new CalculateMathFunctions();
		double ans[] = cmf.calculateTrigonometricFunctions(angle);
		System.out.println("Sine " + ans[0] + " Cosine " + ans[1] + " Tangent " + ans[2]);
	}
	public double[] calculateTrigonometricFunctions(double angle) {
		double rads = Math.toRadians(angle);
		double ans[] = new double[3];
		ans[0] = Math.sin(rads);
		ans[1] = Math.cos(rads);
		ans[2] = Math.tan(rads);
		return ans;
	}

}
