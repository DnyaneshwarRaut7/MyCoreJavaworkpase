package com.abstractionExample;

public class TATA extends vehicle {

	@Override
	public void specification() {  // abstract method override

		System.out.println("=== TATA specification =====");
	}
	//@Override
	//public void tyre() {}   // non abstract method override
	
	public void m4() {
		
		System.out.println("==== TATA m4 method===");
	}

	public static void main(String[] args) {
		
		System.out.println("----- parent child mix class----");


		vehicle v = new TATA(); // parent + child mix object

		v.tyre();
		v.Tering();
		v.specification();
		
		

		System.out.println(" ------ child class-----  ");

		TATA t = new TATA(); // child class
		t.tyre();
		t.Tering();
		t.specification();
        t.m4();
	}

}
//abstraction of abstract class in abstract override method