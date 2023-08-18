package staticandnonstaticblock;

public class Staticblock {

	// static block
	static {

		System.out.println(0);
	}
	static {

		System.out.println(1);
	}

	// non static block
	{

		System.out.println(3);
	}

	// default constructor
	Staticblock() {

		System.out.println("4");

	}
	// m1 method

	public void m1() {
     
		System.out.println(5);
	}

	// main method
	public static void main(String[] args) {
		System.out.println("2");
		Staticblock s = new Staticblock();
		s.m1();
	}

}
