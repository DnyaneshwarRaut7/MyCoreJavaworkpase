package com.overriding;

public class Test {

	public static int i = m1();

	static {

		System.out.println("==== static block====");
	}

	private static int m1() {

		System.out.println("==== m1 static method ====");

		return 20;
	}

	public static void main(String[] args) {
		System.out.println(" === main method === ");

		System.out.println(i);

	}

}
