package com.operter;

public class Starpattern {

	public static void main(String[] args) {

		int i;
		int j;

		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println("  ");

		}
		System.out.println("------------------------------");

		for (i = 5; i >= 1; i--) {

			for (j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println("  ");
		}

		System.out.println("=======================");

		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print("1");
			}
			System.out.println(" ");

		}

		System.out.println("============");

		for (i = 5; i >= 1; i--) {

			for (j = 1; j <= i; j++) {

				System.out.print("1");
			}
			System.out.println("  ");
		}

		System.out.println("===================");

		for (i = 0; i <= 5; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(i);
			}
			System.out.println(" ");

		}
		System.out.println("--------------------------------");
		for (i = 1; i <= 5; i++) {
			
			System.out.print("\t");

			for (j = 1; j <= i; j++) {
				//System.out.print("\t");

				System.out.print("*");
			}
			System.out.println("  ");

		}

	}

}
