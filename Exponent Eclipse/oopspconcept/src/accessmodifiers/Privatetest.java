package accessmodifiers;

public class Privatetest {

	private int id = 10;

	private Privatetest() {// other class object not alloved

		System.out.println("==== private default con===");

	}

	static {

		System.out.println("==== static block ===");
	}

	private void m1() {

		System.out.println("=== private m1 method ===");
	}

	public static void main(String[] args) {

		System.out.println("=== main mthod ====");

		Privatetest p = new Privatetest();
		System.out.println(p.id);
		p.m1();
	}

}
// private access modifiers within class