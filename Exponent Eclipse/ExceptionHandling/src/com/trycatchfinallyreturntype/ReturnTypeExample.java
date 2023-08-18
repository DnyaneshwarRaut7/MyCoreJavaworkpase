package com.trycatchfinallyreturntype;

public class ReturnTypeExample {

	public static int m1() {

		System.out.println(" m1 method of return type example");

		try {

			int i = 10 / 0;
			return i;

		} catch (Exception e) {

			System.out.println(e.getMessage());
			return -1;
		} finally {
			return 10;

		}
	}

	public static void main(String[] args) {
		System.out.println(m1());

	}

}
// final block print