package com.inheritanceexample;

public class Z extends X {
	// X+Z
	int c = 90;

	public void m3() {
		System.out.println("chaild z class m3 method");

	}

	public static void main(String[] args) {
		X x = new X(); // parent class
		System.out.println(x.a);
		x.m1();

		System.out.println("====== y class ===== ");
		Y y = new Y(); // child class object X+Y
		System.out.println(y.a);
		System.out.println(y.b);
		y.m1();
		y.m2();

		System.out.println("==== Z class ====");
		Z z = new Z(); // child class object X+Z
		System.out.println(z.a);
		System.out.println(z.c);
		z.m1();
		z.m3();
	}

}

//hierarchical inheritance