 package com.exponent.bankapplication.serviceimpl;

import java.util.Scanner;

import com.exponent.bankapplication.model.Account;
import com.exponent.bankapplication.service.RBI;

public class CanaraBank implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void registerAccount() {

		ac.setAccountNo(getAccountNO());
		// System.out.println("Enter account Name:");
		// String accountname = sc.next();
		ac.setAccountName(getAccountName());
		// System.out.println("Enter account Adathar number:");
		// long adarname = sc.nextLong();
		ac.setAadharcardNo(getAadharcardNo());
		// System.out.println("Enter your pancard number:");
		// String pancardno = sc.next();
		ac.setPancardNo(getPanno());
		// System.out.println("Enter your Mobail number:");
		// Long mobailno = sc.nextLong();
		ac.setMobailNo(getMobailNo());
		System.out.println("Enter account opening balance :");
		Double accountbalance = sc.nextDouble();
		ac.setAccountBalance(accountbalance);

		System.out.println(" <<<<<<<<<<<  Account Regestation Sucess >>>>>>>>>>>");
	}

	// validation account no

	private int getAccountNO() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number:");
		int acc;
		try {
			acc = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Enter number only characters not alloved.....");
			return getAccountNO();
		}

		String accountno1 = String.valueOf(acc);

		if ((acc <= 0) || (accountno1.length() != 4))

		{
			return getAccountNO();
		}
		return acc;

	}

	public String getAccountName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account name:");
		String name;
		try {
			name = sc.next();

		} catch (Exception e) {

			//System.out.println("Enter characters only number alloved...");
			return getAccountName();
		}
		if (name.length() <= 4) {

			return getAccountName();
		}
		return name;

	}

	public long getMobailNo() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile no:");
		long mobailno;

		try {
			mobailno = sc.nextLong();

		} catch (Exception e) {
			System.out.println("Enter number only characters not alloved.....");
			return getMobailNo();
		}
		String mono = String.valueOf(mobailno);

		if ((mobailno <= 0) || (mono.length() != 10)) {

			return getMobailNo();

		}
		return mobailno;

	}

	public String getPanno() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Pan no:");
		String panno = sc.next();
		if (panno.length() != 10) {

			return getPanno();
		}
		return panno;

	}

	public long getAadharcardNo() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account Adathar number");
		long adharno;
		try {
			adharno = sc.nextLong();

		} catch (Exception e) {
			System.out.println("Enter number only characters not alloved.....");
			return getAadharcardNo();

		}
		String adharcardno = String.valueOf(adharno);
		if ((adharno <= 0) || (adharcardno.length() != 12)) {

			return getAadharcardNo();
		}

		return adharno;
	}

	@Override
	public void showAccountDetails() {

		System.out.println("Enter your account number");
		int accno = sc.nextInt();
		if (ac.getAccountNo() == accno) {

			System.out.println("your account no : - " + ac.getAccountNo());
			System.out.println("your account name : " + ac.getAccountName());
			System.out.println("your account Adather no : " + ac.getAadharcardNo());
			System.out.println("your account pan no : " + ac.getPancardNo());
			System.out.println("your mobail  no: " + ac.getMobailNo());
			System.out.println("your account balance : " + ac.getAccountBalance());

			System.out.println(" <<<<<<< show Account Details >>>>>>>");

		} else {
			System.out.println("Account does not exist !!!");

		}
	}

	@Override
	public void showAccountBalance() {

		System.out.println("Enter your account no:- ");

		int accno = sc.nextInt();
		if (ac.getAccountNo() == accno) {

			System.out.println("Current Account balance is :" + ac.getAccountBalance());
		}

	}

	@Override
	public void depositAmount() {

		System.out.println("Enter your acc no:-");
		int accno = sc.nextInt();
		if (ac.getAccountNo() == accno) {

			System.out.println("Enter Deposit amount : ");
			double depositamo = sc.nextDouble();

			double total = ac.getAccountBalance() + depositamo;
			ac.setAccountBalance(total);

			System.out.println("Total account balance is :- " + total);
		}
	}

	@Override
	public void withdrawAmount() {

		System.out.println("Enter your acc no:-");
		int accno = sc.nextInt();

		if (ac.getAccountNo() == accno) {

			System.out.println("Enter Withdraw Amount :");
			double withdrawamo = sc.nextDouble();
			if (withdrawamo <= ac.getAccountBalance()) {
				double total1 = ac.getAccountBalance() - withdrawamo;
				ac.setAccountBalance(total1);

				System.out.println("Avalable Balance Account :-" + total1);
			} else {

				System.out.println("Money is not available");
			}

		}
	}

	@Override
	public void updateAccountInfo() {

		System.out.println("Update Account Information :");
		{
			Scanner sc = new Scanner(System.in);

			boolean flag = true;
			while (flag) {
				System.out.println("**************************************");
				System.out.println(" 1 :-Enter your update account Name:");
				System.out.println(" 2 :-Enter your update Adathar number:");
				System.out.println(" 3 :-Enter your update pancard number:");
				System.out.println(" 4 :-Enter your update Mobail  number:");
				System.out.println(" 5 :-exit");
				System.out.println("***************************************");

				System.out.println("Enter your choice:-");

				int choice = sc.nextInt();

				switch (choice) {

				case 1:

					System.out.println("Enter your update account Name:");
					String accountname = sc.next();
					ac.setAccountName(accountname);
					break;
				case 2:
					System.out.println("Enter your update Adathar number:");
					long adarname = sc.nextLong();
					ac.setAadharcardNo(adarname);
					break;
				case 3:
					System.out.println("Enter your update pancard number:");
					String pancardno = sc.next();
					ac.setPancardNo(pancardno);
					break;
				case 4:

					System.out.println("Enter your update Mobail number:");
					Long mobailno = sc.nextLong();
					ac.setMobailNo(mobailno);
					break;
				case 5:
					flag = false;
					break;
				default:

					System.out.println("Wrong choice");
					sc.close();

				}

			}

			System.out.println(" <<<<<<<<<<< your  Account informention Update Sucess >>>>>>>>>>>");

		}

	}

	// TODO Auto-generated method stub

}

//polymorphism oopss