package oops_practice.gcr_codebase.this_static_final_and_instanceOf;
class Employee{
	private static String companyName;
	private static int employeeCount;
	private String name;
	final private int id;
	private String designation;
	static {
		companyName = "Tech Solutions Inc.";
		employeeCount = 0;
	}
	
	Employee(){
		this("Unknown", 0, "N/A");
		employeeCount = employeeCount - 1 > 0 ? employeeCount - 1 : 0;
	}
	
	public Employee(String name, int id, String designation) {
		employeeCount++;
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.designation = designation;
	}
	
	void display() {
		System.out.println("Company Name: " + companyName);
		System.out.println("Employee ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Designation: " + designation);
		System.out.println();
	}
	
	static void displayTotalEmployees() {
		System.out.println("Total Employees: " + employeeCount);
	}
}
public class EmployeeManagementSystem {

	static boolean checkInstanceOfEmoloyee(Object obj) {
		return obj instanceof Employee;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Thamarai", 101, "Software Engineer");
		Employee e2 = new Employee("Rohan", 102, "Project Manager");
		Employee.displayTotalEmployees();
		if(checkInstanceOfEmoloyee(e1)) {
			e1.display();
		}
		else {
			System.out.println("Invalid instance");
		}
		if(checkInstanceOfEmoloyee(e2)) {
			e2.display();
		}
		else {
			System.out.println("Invalid instance");
		}
	}

}
