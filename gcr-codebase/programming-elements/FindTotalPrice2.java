import java.util.Scanner;
public class FindTotalPrice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit price and quantity");
		double unitPrice = sc.nextDouble();
		int quantity = sc.nextInt();
		double total = unitPrice * quantity;
		System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	}

}
