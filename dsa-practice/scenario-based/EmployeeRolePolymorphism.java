package oops_practice.scenario_based;

abstract class Employee {
	private final String name;
	private final double salary;
	Employee(String name, double salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	abstract double getBonus();
}

class Manager extends Employee {

	Manager(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getBonus() {
		// TODO Auto-generated method stub
		return 0.1 * getSalary();
	}
}

class Developer extends Employee {

	Developer(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getBonus() {
		// TODO Auto-generated method stub
		return getSalary() > 50000 ? 0.05 * getSalary() : 0;
	}
}

public class EmployeeRolePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee manager = new Manager("Alice", 80000); 
		Employee developer1 = new Developer("Govind", 60000); 
		Employee developer2 = new Developer("Akash", 40000);
		
		System.out.printf("%.2f%n", manager.getBonus()); 
		System.out.printf("%.2f%n", developer1.getBonus()); 
		System.out.printf("%.2f%n", developer2.getBonus()); 
	}

}
