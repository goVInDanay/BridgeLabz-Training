package oops_practice.scenario_based.hospital_management_system;

class Person {
	protected int id;
	protected String name;
	protected int age;

	Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
