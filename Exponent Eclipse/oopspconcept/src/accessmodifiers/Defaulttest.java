package accessmodifiers;

public class Defaulttest {

	 int i = 99;
	
	Defaulttest(){
		
		System.out.println("------default con----");
	}

	void m1() {

		System.out.println("==== default m1 ethod  ====");
	}

	public static void main(String[] args) {

		Defaulttest d = new Defaulttest();

		System.out.println(d.i);
		d.m1();
	}

}

//default access modifiers within class / same package