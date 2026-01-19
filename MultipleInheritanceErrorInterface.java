interface Interface1 {
	int a = 10;
}

interface Interface2 {
	int a = 10;
}

class MultipleInheritance implements Interface1, Interface2 {
	public void display() {
		System.out.println(super.a);
	}
}


public class MultipleInheritanceErrorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj = new MultipleInheritance();
		obj.display();
	}

}
