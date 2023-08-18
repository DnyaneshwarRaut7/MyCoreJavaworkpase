 package com.superandthiskeyword;

public class B extends A {

	int j = 20;

	B() {
		super();
		System.out.println("default cont of B class");
	}

	public void m2() {

		System.out.println("m2 method of child class");
		System.out.println(super.i);
		super.m1();
	}

	public void m3() {

		System.out.println("m3 method of child class");
        System.out.println(this.j);
        this.m2();
	}

	public static void main(String[] args) {

		B b = new B(); // child class object
		b.m1();
		b.m2();
		b.m3();
	}

}
//super & this keyword