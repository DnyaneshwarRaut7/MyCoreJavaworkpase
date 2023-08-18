 package com.inheritanceexample;

public class B extends A {

	int j = 20; // Global method

	public void m2() // m2 method
	{
		System.out.println("m2 method of B class");
	}

	public static void main(String[] args) {
		// parent class object
		A a = new A();
		System.out.println(a.i);
		a.m1();
		
		System.out.println("==================================");

		B b = new B(); // child class // parent + child
		System.out.println(b.i);
		System.out.println(b.j);
		b.m1();
		b.m2();
	}

}




       //single inheritance