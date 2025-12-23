import java.util.*;
public class FindStringEquals {
	private static boolean userEquals(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
		return true;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.trim();
        s2 = s2.trim();
        boolean userComparision = userEquals(s1, s2);            
        boolean equalsComparision = s1.equals(s2);
        System.out.println("The output from comparing using charAt is " + userComparision + " and from Equals method is " + equalsComparision);
    }
}
