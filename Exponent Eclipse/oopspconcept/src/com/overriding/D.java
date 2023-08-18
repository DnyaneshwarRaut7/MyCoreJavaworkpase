package com.overriding;

public class D extends C {

	@Override
	public int display() {

		System.out.println("overide method");

		return 77;
	}

	@Override
	public D m1() {

		System.out.println("==== covarreant m1 method ");

		return new D();

	}

	public static void main(String[] args) {

		C c = new C(); // parent object
		int g = c.display();

		System.out.println(g);

		C c1 = new D(); // parent child miX object
		int a = c1.display();

		System.out.println(a);
		c1.m1();

		int f = c1.display(); // override return also
	}

}
// pollymorphism in overriding method same return type covareant return also