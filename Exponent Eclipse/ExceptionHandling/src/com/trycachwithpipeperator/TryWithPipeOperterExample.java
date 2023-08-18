package com.trycachwithpipeperator;

public class TryWithPipeOperterExample {

	public static void main(String[] args) {

		System.out.println(" --------- main method start------");

		try {

			float[] f = new float[2];
			f[0] = 10.123f;
			f[1] = 11.22f;

			System.out.println(" value of float :" + f[1]);

			Integer i = new Integer(7);
			System.out.println("value of i" + i);

			float k = 10 / 0;
			System.out.println("value of k:" + k);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			System.out.println(" === Try with pipe operator cath block ====");
			e.printStackTrace();
		}
	}

}

//1 try block with 1 catch blocks pipe operator
//jdk 1.7
//catch block sequence 1 sub class 2 same level 3 pareant class