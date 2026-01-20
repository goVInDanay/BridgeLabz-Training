package oops_practice.scenario_based;

abstract class BankAccount1 {
	private final String accountNumber;
	double balance;

	public BankAccount1(String accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	abstract double calculateFee();
}

class SavingsAccount1 extends BankAccount1 {
	public SavingsAccount1(String accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		super(accountNumber, balance);
	}

	@Override
	public double calculateFee() {
		return 0.005 * balance;
	}
}

class CheckingAccount extends BankAccount1 {
	public CheckingAccount(String accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		super(accountNumber, balance);
	}

	@Override
	public double calculateFee() {
		return balance < 1000 ? 1 : 0;
	}
}

public class BankAccountHeirarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount1 savings1 = new SavingsAccount1("12345", 1000.0);
		BankAccount1 savings2 = new SavingsAccount1("12345", 1000.0);
		BankAccount1 checking1 = new CheckingAccount("12346", 1500);
		BankAccount1 checking2 = new CheckingAccount("12347", 500);
		System.out.printf("Savings ->%.2f%n", savings1.calculateFee());
		System.out.printf("Savings ->%.2f%n", savings2.calculateFee());
		System.out.printf("Checking ->%.2f%n", checking1.calculateFee());
		System.out.printf("Checking ->%.2f%n", checking2.calculateFee());
	}

}
