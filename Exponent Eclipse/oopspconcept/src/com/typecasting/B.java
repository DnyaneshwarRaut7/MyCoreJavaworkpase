 package com.typecasting;

public class B {

	public static void main(String[] args) {

		double d = 888.77;

		float f = (float) d;
		long l = (long) d;
		int i = (int) d;
		char c = (char) d;
		byte b = (byte) d;
		short s = (short) d;

		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);

	}

}
// narrow casting type greater to small  ((manual))