package com.typecasting;

public class A {

	public static void main(String[] args) {
		byte b = 7;
		short s = b;
		char c = 'b';
		int i = b;

		double d = i;
		long l = i;
		float f = i;

		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		System.out.println(l);
		System.out.println(f);

	}

}
// Wading casting type smaller to greater ((automatic))