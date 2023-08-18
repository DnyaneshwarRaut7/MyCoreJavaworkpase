package com.loop;

import java.util.Scanner;

public class ForLoopTest {

	public static void main(String[] args) {
		System.out.println("Main method started..");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();

		// 1. initialization 2. condition 3. increment/decrement
		
		for (int i = 1; i <= n; i++) {
			ForLoopTest.display(i);// 1+1=2, 2+1=3

		}

		for (int i = n; i > 0; i--) {// i=10, 10--=10-1=9, 9--=9-1=8,7,...1

			ForLoopTest.display(i);
		}
		System.out.println("Main method Completed..");
	}

	public static void display(int i) {
		System.out.println("Value of I :" + i);
	}

}
