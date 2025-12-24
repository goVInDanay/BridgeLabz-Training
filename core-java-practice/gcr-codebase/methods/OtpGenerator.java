package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class OtpGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int otps[] = getOtps(10);
		System.out.println("OTPs " + Arrays.toString(otps));
		System.out.println("Are otps unique " + areOtpsUnique(otps));
	}
	public static int generateOtp() {
		return (int)(Math.random() * 90000) + 10000;
	}
	public static int[] getOtps(int size) {
		int otps[] = new int[size];
		for(int i = 0; i < size; i++) {
			otps[i] = generateOtp();
		}
		return otps;
	}
	public static boolean areOtpsUnique(int otps[]) {
		int n = otps.length;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(otps[i] == otps[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
