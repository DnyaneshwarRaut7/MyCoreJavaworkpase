package com.nestedtrycatchblock;

public class InnerTryCatchBlock {

	public static void main(String[] args) {

		System.out.println("== main method ==");

		try {
			System.out.println("outer Try Block");

			Integer i = new Integer(20);
			System.out.println("valu of i" + i);

			try {
				System.out.println("Ineer try block");
				int j = 10 / 0;
				System.out.println("valu of j :" + j);

			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println(" inner catch block");

				e.printStackTrace();
			}

		} catch (Exception e) {

			System.out.println("outer catch block");
			e.printStackTrace();
		}
	}

}
// outer try block Exception outer catch block ;;;; jvm call
// inner try block Exception inner catch block ;;;; outer catch block ;;;; jvm call