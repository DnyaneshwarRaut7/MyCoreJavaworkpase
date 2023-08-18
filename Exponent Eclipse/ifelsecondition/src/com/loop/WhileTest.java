package com.loop;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		System.out.println("Main Method started....");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();

		boolean flag = false;

		while (flag) {
			System.out.println("****Inside while loop...");
		}

		// --- Do While loop
		do {
			System.out.println("Inside do while---");

		} while (flag);

		int i = 1;
		// take value of 5 from scanner ...
		while (i <= 5) {// 6<=5
			System.out.println("Inside While loop------" + i);
			i++;
		}

		System.out.println("Main Method Completed....");

	}

}
