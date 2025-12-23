
public class FindDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fee = 125000;
		int discountPercent = 10;
		double discount = (discountPercent * fee) / 100;
		double payable = fee - discount;
		System.out.println("The discounted amount is INR " + discount + " and final discounted fee is INR " + payable);
	}

}
