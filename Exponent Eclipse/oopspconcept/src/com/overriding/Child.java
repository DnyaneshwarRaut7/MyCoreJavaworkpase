package com.overriding;

public class Child extends Parent {
	@Override
	public void m1() {
		System.out.println("==== overide method m1  child class====");
	}

	public void m4() {

		System.out.println("==== child class of m4 method=====");

	}

	public static void main(String[] args) {

		Parent p = new Parent(); // parent class object only parent class method call
		p.m1();
		p.m2();
		p.m3();

		System.out.println("===mixed object===");

		Parent p1 = new Child(); // parent child mix object parent class method call & child override method call
		p1.m1();
		p1.m2();
		p1.m3();

		System.out.println("=== child class object===");

		Child c = new Child(); // child class object parent class override method & child class
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}
}
// pollymorphism in overriding method program