package com.inheritanceexample;

public class Subclass extends Super {

	int y = 40;

	@Override
	public void m1() {
		System.out.println("Overrided m1 method in chaild class ");

	}

	@Override
	public void m3() {
		System.out.println("Overried m3 method in chaild class");

	}

	public void m2() {

		System.out.println("child class m2 method ");
	}

	public static void main(String[] args) {
		// parent class object
		Super super1 = new Super();
		System.out.println(super1.x);
		super1.m1();
		super1.m3();
		super1.m4();

		// parent child mix object

		System.out.println("=====parent chaild mix object=====");

		Super super2 = new Subclass();
		System.out.println(super2.x);
		super2.m1();
		super2.m3();
		super2.m4();
		
		// child class object

		System.out.println("=== child class object===");

		Subclass subclass = new Subclass();
		System.out.println(subclass.x);
		System.out.println(subclass.y);
		subclass.m1();
		subclass.m2();
		subclass.m3();
		subclass.m4();

	}

}
// single inheritance override