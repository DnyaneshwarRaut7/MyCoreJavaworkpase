package com.superandthiskeyword;

public class Q extends P {

	Q() {
		this("mauli", 88);
		System.out.println("444");
	}

	Q(String s, int j) {
		this(123.67f);
		System.out.println("555");
	}

	Q(char c, boolean b, double d) {

		this();
		System.out.println("666");
	}

	Q(float f) {

		super(10);
		System.out.println("777");
	}

	public static void main(String[] args) {
		Q q = new Q('h', true, 10.123d);

	}

}

//super & this keyword constructor chain