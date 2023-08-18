package com.typecasting;

public class Test {

	public X m1() {

		X x = new X();
		Y y = new Y();
		Z z = new Z();
		return z;
	}

	public static void main(String[] args) {

		Test test = new Test();
		X x = test.m1();
		System.out.println(x.a);
		x.m1();

		System.out.println("====== y ======");
		Y y = (Y) test.m1();// Nerving casting greater to smaller
		System.out.println(y.a);
		System.out.println(y.b);
		y.m1();
		y.m2();

		System.out.println("====== z =======");
		Z z = (Z) test.m1(); // Nerving casting greater to smaller
		System.out.println(z.a);
		System.out.println(z.b);
		System.out.println(z.c);
		z.m1();
		z.m2();
		z.m3();

	}

}
//multilevel inheritance class covarreant return type