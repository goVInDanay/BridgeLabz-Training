package java8_features_practice.gcr_codebase.collectors;

import java.util.*;
import java.util.stream.*;

class Employee {
	String name;
	String department;
	double salary;

	Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}
}

public class EmployeeSalaryCatagorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(new Employee("Govind", "IT", 10000),
				new Employee("Akash", "IT", 200000), new Employee("Nitai", "HR", 155000),
				new Employee("Aman", "HR", 150000));

		Map<String, Double> avgSalaryByDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalaryByDept);
	}

}
