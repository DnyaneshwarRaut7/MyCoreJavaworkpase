package com.trycachwithpipeperator;

public class TryWithPipeOperator {

	public static void main(String[] args) {

		System.out.println("=== main methd===");

		try {
			String s = args[1]; // 20
			System.out.println("valu of s:" + s);

			int i = Integer.parseInt(s); // ab
			System.out.println("valu of i:" + i);

			int c = 10 / i; // 0
			System.out.println("valu of c :" + c);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {

			e.printStackTrace();
		}
	}

}

//1 try block with 1 catch blocks pipe operator
//jdk 1.7
//catch block sequence 1 sub class 2 same level 3 pareant class