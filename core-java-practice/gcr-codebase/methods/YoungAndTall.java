package core_java_practice.gcr_codebase.methods;
import java.util.*;	
public class YoungAndTall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age[] = new int[3];
		double height[] = new double[3];
		for(int i  =0 ; i < age.length; i++) {
			age[i] = sc.nextInt();
		}
		for(int i = 0; i < height.length; i++) {
			height[i] = sc.nextDouble();
		}
		String names[] = {"Amar", "Akbar", "Anthony"};
		int youngest = findYoungest(age);
		int tallest = findTallest(height);
		System.out.println("Youngest is " + names[youngest] + " Tallest is " + names[tallest]);
	}
	
	private static int findYoungest(int age[]) {
		int youngest = 0;
		for(int i = 0; i < age.length; i++) {
			if(age[youngest] > age[i]) {
				youngest = i;
			}
		}
		return youngest;
	}
	
	private static int findTallest(double height[]) {
		int tallest = 0;
		for(int i = 0; i < height.length; i++) {
			if(height[tallest] < height[i]) {
				tallest = i;
			}
		}
		return tallest;
	}

}
