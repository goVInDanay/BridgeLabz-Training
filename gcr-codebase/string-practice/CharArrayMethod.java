import java.util.*;
public class CharArrayMethod {
	private static char[] userCharArray(String s) {
		int len = s.length();
		char chars[] = new char[len];
		for(int i = 0; i < len; i++) {
			chars[i] = s.charAt(i);
		}
		return chars;
	}
	private static boolean userEquals(char arr1[], char arr2[]) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char arr[] = userCharArray(s);
		char methodArr[] = s.toCharArray();
		System.out.println("User Char Array ->");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Method Char Array ->");
		for(int i = 0; i < methodArr.length; i++) {
			System.out.print(methodArr[i] + " ");
		}
		System.out.println();
		boolean equal = userEquals(arr, methodArr);
		System.out.println("The array are equal ? " + equal);
	}

}
