package com.exponent.bankapplication.controller;

import java.util.Scanner;

import com.exponent.bankapplication.service.RBI;
import com.exponent.bankapplication.serviceimpl.CanaraBank;

public class AdminController {

	public static void main(String[] args) {

		System.out.println("******** WELCOME TO CANARA BANK ********");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		RBI rbi = new CanaraBank();

		while (flag) {

			System.out.println("________________________________________");
			System.out.println("1: Create Bank Account");
			System.out.println("2: Show Account Details");
			System.out.println("3: show Account Balance");
			System.out.println("4: Deposit Amount");
			System.out.println("5: Withraw Amount");
			System.out.println("6: Update Account Information");
			System.out.println("7: Exit!!!!");
			System.out.println("_________________________________________");

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
				break;
			default:
				System.out.println("Worang choice");
			}

		}
		sc.close();
		System.out.println(" Thank for Banking -------!!!");

	}

}
