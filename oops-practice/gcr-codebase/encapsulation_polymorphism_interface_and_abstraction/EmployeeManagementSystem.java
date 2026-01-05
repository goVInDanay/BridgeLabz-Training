package oops_practice.gcr_codebase.encapsulation_polymorphism_interface_and_abstraction;

import java.util.*;

interface Department {
	void assignDepartment(String department);

	String getDepartmentDetails();
}

abstract class Employee implements Department {
	private int employeeId;
	private String name;
	private double baseSalary;
	private String department;

	Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void assignDepartment(String department) {
		this.department = department;
	}

	@Override
	public String getDepartmentDetails() {
		return department;
	}

	abstract double calculateSalary();

	void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Base Salary: " + baseSalary);
		System.out.println("Department: " + department);
		System.out.println("Total Salary: " + calculateSalary());
	}
}

class FullTimeEmployee extends Employee {

	FullTimeEmployee(int employeeId, String name, double baseSalary) {
		super(employeeId, name, baseSalary);
	}

	@Override
	protected double calculateSalary() {
		return getBaseSalary();
	}
}

class PartTimeEmployee extends Employee {

	double hourlyRate;
	int hoursWorked;

	PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
		super(employeeId, name, 0);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	protected double calculateSalary() {
		return hourlyRate * hoursWorked;
	}
}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new FullTimeEmployee(1, "Govind", 100000);
		Employee e2 = new PartTimeEmployee(2, "Hariom", 500, 4);
		e1.assignDepartment("SDE");
		e2.assignDepartment("Cloud");
		employees.add(e1);
		employees.add(e2);
		for (Employee e : employees) {
			e.displayDetails();
		}
	}

}
