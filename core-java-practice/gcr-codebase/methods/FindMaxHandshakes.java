package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FindMaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FindMaxHandshakes obj = new FindMaxHandshakes();
        int maxHandshakes = obj.findMaxHandshakes(n);
        System.out.println(maxHandshakes);
    }
    private int findMaxHandshakes(int n){
        return (n * (n - 1)) / 2;
    }
}