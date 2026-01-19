interface Interface1 {
	void display();
}

class MClass {
	public int a() {
		System.out.println("10");
	}
}

class MClass2 {
	public int a() {
		System.out.println("11");
	}
}

class MultipleInheritance extends MClass, MClass2 {
	public void display() {
		super.a();
	}
}

public class MultipleInheritanceError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj = new MultipleInheritance();
		obj.display();
	}

}
