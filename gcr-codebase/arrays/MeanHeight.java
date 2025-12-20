import java.util.*;
public class MeanHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double height[] = new double[11];
		for(int i = 0; i < 11; i++) {
			height[i] = sc.nextDouble();
		}
		double sumHeight = 0;
		for(int i = 0; i < height.length; i++) {
			sumHeight += height[i];
		}
		double meanHeight = sumHeight / height.length;
		System.out.println("Mean height is " + meanHeight);
	}

}
