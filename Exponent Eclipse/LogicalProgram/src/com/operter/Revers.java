package com.operter;

import java.util.Scanner;

public class Revers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:-");

		int n = sc.nextInt();
		int temp = n;
		int r, rev = 0;

		while (n > 0) {

			r = n % 10;
			rev = rev * 10 + r;

			n = n / 10;

		}
		// System.out.println(n);
		System.out.println("Reverse number is: " + rev);
		if (temp == rev) {
			System.out.println("Number is palindrom");
		} else {
			System.out.println("Number is not palindrom");
		}

	}
}