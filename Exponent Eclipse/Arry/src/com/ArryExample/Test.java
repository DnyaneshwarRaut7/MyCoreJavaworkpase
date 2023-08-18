package com.ArryExample;

public class Test {

	public static void main(String[] args) {
// 1 way
		int[] arryofints = new int[5];
		{

			arryofints[0] = 10;
			arryofints[1] = 20;
			arryofints[2] = 30;
			arryofints[3] = 40;
			arryofints[4] = 50;

			System.out.println(arryofints.length);
			System.out.println(arryofints[2]);
			System.out.println(arryofints[4]);
			System.out.println(arryofints[0]);
			System.out.println(arryofints[3]);
			System.out.println(arryofints[1]);

// 2 way

			Double[] arryofdouble = new Double[] { 1.1, 2.2, 3.3 };

			System.out.println(arryofdouble.length);
			System.out.println(arryofdouble[2]);

			for (int i = 0; i < arryofdouble.length; i++) {// for loop use of arry
				System.out.println(arryofdouble[i]);

			}

		}
	}

}
// Arry Instantiating 1 way & 2 way