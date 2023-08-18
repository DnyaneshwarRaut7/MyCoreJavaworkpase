package accessmodifiers;

public class Demo extends ProtectedTest {
	
	int w = 888;
	
	public void m8() {
		
		System.out.println("======== class demo m8 method======");
	}

	public static void main(String[] args) {

		// Privatetest p = new Privatetest();
		// System.out.println(p.id);
		// p.m1();

		Defaulttest d = new Defaulttest();

		System.out.println(d.i);
		d.m1();

		ProtectedTest p = new ProtectedTest();  //parent class protected

		System.out.println(p.id);
		p.m1();
		
		ProtectedTest p1 = new Demo();  // parent child mix object
		
		System.out.println(p1.id);
		p1.m1();
		
		Demo demo = new Demo();   // child class object
		System.out.println(demo.id);
		System.out.println(demo.w);
		demo.m1();
		demo.m8();
	}

}
//default access modifiers within class / same package
//protected access modifiers within class / same package /  out site package   
// parent child relation ship class objects