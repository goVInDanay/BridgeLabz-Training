import java.util.*;
public class BonusCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service: ");
            years[i] = sc.nextDouble();
            if (salary[i] <= 0 || years[i] < 0) {
                System.err.println("Invalid input! Please enter again.\n");
                i--;
                continue;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
	}

}
