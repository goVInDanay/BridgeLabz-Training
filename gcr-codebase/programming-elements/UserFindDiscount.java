import java.util.Scanner;
public class UserFindDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fee and discount percent");
		double fee = sc.nextDouble();
		double discountPercent = sc.nextDouble();
		double discount = (discountPercent * fee) / 100;
		double payable = fee - discount;
		System.out.println("The discounted amount is INR " + discount + " and final discounted fee is INR " + payable);
	}

}
