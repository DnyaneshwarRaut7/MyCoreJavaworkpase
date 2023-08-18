package com.paramtermethod;

public class A {
	A() {
		System.out.println("default const");
	}

	A(int i) {
		System.out.println("single parameter const");
		System.out.println(i);
	}

	A(int i, String s) {
		System.out.println("doubale parameter const");
		System.out.println(i + " " + s);

	}

	public static void main(String[] args) {

		A a = new A();
		A a1 = new A(99);
		A a2 = new A(77, "mauli");

	}

}
