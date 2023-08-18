package com.operter;

import java.util.Scanner;

public class OperterExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");

		int g = sc.nextInt();

		if (g % 2 == 0) {

			System.out.println("Number is even:");
		} else {

			System.out.println("Number is odd:");
		}

	}
}
//modules operator