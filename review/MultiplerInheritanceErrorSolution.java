package review;
interface Interface11 {
	int a = 10;
}

interface Interface12 {
	int a = 10;
}

class MultipleInheritance3 implements Interface11, Interface12 {
	public void display() {
		System.out.println(Interface11.a);
	}
}


public class MultiplerInheritanceErrorSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance3 obj = new MultipleInheritance3();
		obj.display();
	}

}
