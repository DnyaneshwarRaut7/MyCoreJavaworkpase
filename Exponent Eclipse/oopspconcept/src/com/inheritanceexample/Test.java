package com.inheritanceexample;

public class Test {

	public static void main(String[] args) {
		X x = new X();
		System.out.println(x.a);
		x.m1();

		System.out.println("====== y class ===== ");
		Y y = new Y();
		System.out.println(y.a);
		System.out.println(y.b);
		y.m1();
		y.m2();

		System.out.println("==== Z class ====");
		Z z = new Z();
		System.out.println(z.a);
		System.out.println(z.c);
		z.m1();
		z.m3();
	}

}
//hierarchical inheritance