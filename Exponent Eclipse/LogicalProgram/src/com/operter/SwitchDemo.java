package com.operter;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		System.out.println(" ====== select your Collage ==== ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a collage  name:");

		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("DYP");
			break;
		case 2:
			System.out.println("PCCOE");
			break;
		case 3:
			System.out.println("FC");
			break;
		case 4:
			System.out.println("SP");
			break;
		case 5:
			System.out.println("DADA PATIL ");
			break;
		default:
			System.out.println("invalide option");

			break;

		}
	}

}
