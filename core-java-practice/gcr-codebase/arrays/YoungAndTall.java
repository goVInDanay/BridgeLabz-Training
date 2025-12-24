import java.util.*;
public class YoungAndTall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age[] = new int[3];
		double height[] = new double[3];
		for(int i  =0 ; i < age.length; i++) {
			age[i] = sc.nextInt();
		}
		for(int i = 0; i < height.length; i++) {
			height[i] = sc.nextDouble();
		}
		int youngest = 0;
		int tallest = 0;
		String names[] = {"Amar", "Akbar", "Anthony"};
		for(int i = 0; i < age.length; i++) {
			if(age[youngest] > age[i]) {
				youngest = i;
			}
			if(height[tallest] < height[i]) {
				tallest = i;
			}
		}
		System.out.println("Youngest is " + names[youngest] + " and tallest is " + names[tallest]);
	}

}
