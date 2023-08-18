package com.controller;

import java.util.Scanner;

import com.sbi.service.RBI;
import com.sbi.servicelmpl.SBI;

public class AdminController {

	public static int choice() {
		Scanner sc = new Scanner(System.in);
		try {
			int ch = sc.nextInt();
			return ch;
		} catch (Exception e) {
			// System.out.println("Invalid Input Please Enter Valid Input");
			int ch = 100;
			return ch;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBI();
		do {
			System.out.println("\n===MENU===");
			System.out.println("1. Create/Open Account");
			System.out.println("2. Display Account Balance");
			System.out.println("3. Display Account Details");
			System.out.println("4. Deposite Amount");
			System.out.println("5. Withdraw Amount");
			System.out.println("6. Update Profile Details");
			System.out.println("7. Exit The Applocation");

			System.out.println("Select One Of The Abow Menu");
			int ch = choice();

			switch (ch) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.displayBalance();
				break;
			case 3:
				rbi.displayDetails();
				break;
			case 4:
				rbi.depositeAmount();
				break;
			case 5:
				rbi.withdrawAmount();
				break;
			case 6:
				rbi.updateProfile();
				break;
			case 7:
				System.out.println("User Want To Exit The Applocation\n***THANK YOU***");
				flag = false;
				break;
			default:
				System.out.println("This Is Not Valid Input");
				break;
			}
		} while (flag);

	}

}
