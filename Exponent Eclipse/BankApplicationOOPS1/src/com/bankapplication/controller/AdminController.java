package com.bankapplication.controller;

import java.util.Scanner;

import com.bankapplication.service.RBI;
import com.bankapplicaton.serviceimpl.SBI;

public class AdminController {

	public static void main(String[] args) {

		System.out.println("********** WCLCOME TO SBI BANK *************");
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		RBI rbi = new SBI();

		while (flag) {

			System.out.println("------------------------");
			System.out.println("1. Create bank account:- ");
			System.out.println("2. Show Accoune details:-");
			System.out.println("3. Show Accoune balance:-");
			System.out.println("4. Deposit Amount:-");
			System.out.println("5. Withrow Amount:-");
			System.out.println("6. Update Accounr Informention:-");
			System.out.println("7. Exit");
			System.out.println("-------------------------------");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				rbi.registerAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.depositAmount();
				break;
			case 5:
				rbi.withdrawAmount();
				break;
			case 6:
				rbi.updateAccountInfo();
				break;
			case 7:
				flag = false;
			default:
				System.out.println("Wronge Choice..........");

			}

		}
		sc.close();
		System.out.println("Thank for banking.....!!!!");
	}

}
