package com.multipalcatchblock;

public class MultipleCatchBlockExample {

	public static void main(String[] args) {

		System.out.println("=== main methd===");

		try {

			float[] f = new float[2];
			f[0] = 10.123f;
			f[1] = 11.22f;

			System.out.println(" value of float :" + f[1]);

			Integer i = new Integer(7);
			System.out.println("value of i" + i);

			float k = 10 / 0;
			System.out.println("value of k:" + k);

			//String str = null;
			//System.out.println("valu of str: " + str);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("----Float exception---");
			e.printStackTrace();

		} catch (NumberFormatException e) {
			System.out.println("number format exception");
			e.printStackTrace();

		} catch (ArithmeticException e) {

			System.out.println("Arithmatic Exception");

			e.printStackTrace();

		//} catch (NullPointerException e) {

			//System.out.println("Null pointer Exception");

			//e.printStackTrace();

		} catch (Exception e) {

			System.out.println(" pareant catch block");

			e.printStackTrace();

		}

	}
}

//1 try block with multiple catch blocks
//jdk 1.6
//catch block sequence 1 sub class 2 same level 3 pareant class