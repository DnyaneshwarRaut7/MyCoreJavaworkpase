package com.loop;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		System.out.println("This is main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Integer number: ");
		int i = sc.nextInt();
		System.out.println("Value from scanner is : " + i);

		System.out.println("Enter Your Name: ");
		String name = sc.next();
		System.out.println("Hi " + name + "  Welcome to Exponent");

	}

}
