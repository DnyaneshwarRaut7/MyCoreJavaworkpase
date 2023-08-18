package accessmodifiers;

public class ProtectedTest {
	
	protected int id = 22;
	
	protected void m1(){
		
		System.out.println("procted method");
	}

	public static void main(String[] args) {
		
		ProtectedTest p = new ProtectedTest();
		
		System.out.println(p.id);
		p.m1();
	}

}
//protected access modifiers within class / same package /  out site package   
//parent child relation ship class objects