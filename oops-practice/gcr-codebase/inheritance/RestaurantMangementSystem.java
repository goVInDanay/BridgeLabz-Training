package oops_practice.gcr_codebase.inheritance;

class Person1 {
	private String name;
	private int id;

	Person1(String name, int id) {
		this.name = name;
		this.id = id;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}
}

interface Worker {
	void performDuties();
}

class Chef extends Person1 implements Worker {
	Chef(String name, int id) {
		super(name, id);
	}

	@Override
	public void performDuties() {
		super.display();
		System.out.println("Chef Cooks");
	}
}

class Waiter extends Person1 implements Worker {
	Waiter(String name, int id) {
		super(name, id);
	}

	@Override
	public void performDuties() {
		super.display();
		System.out.println("Waiter Waits Tables");
	}
}

public class RestaurantMangementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef c1 = new Chef("Govind", 1);
		Waiter w1 = new Waiter("Akash", 10);
		c1.performDuties();
		System.out.println();
		w1.performDuties();
	}

}
