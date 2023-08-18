 package staticandnonstaticblock;

public class Blocktest {

	static {
		System.out.println("===static block===");

	}

	{

		System.out.println("=== non static block===");
	}

	Blocktest() {

		System.out.println("=== deafailt constatar===");

	}

	public void m1() {

		System.out.println("=== m1 method ====");

	}

	public static void main(String[] args) {
		System.out.println("====main method==== ");

		Blocktest b = new Blocktest();
		b.m1();
		Blocktest b1 = new Blocktest();

	}

}
