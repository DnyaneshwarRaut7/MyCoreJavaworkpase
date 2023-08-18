package com.custamexception;

import java.util.Scanner;

public class AccountNoLogic {

	public static String accNo() throws AccountCheck {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your valid account No :");

		String Accno = sc.next(); 

		if (!Accno.isEmpty() && Accno.equals("2121") && Accno.endsWith("1") && Accno.startsWith("2")
				&& Accno.length() == 4) {

			System.out.println("Welcome .... Your Acount Is Open");

		} else {
			System.out.println("Entered Account no is wroung please try again ...!");
			throw new AccountCheck( accNo());
			

		}
		return Accno;

	}

	public static void main(String[] args) {

		try {
			accNo();
		} catch (AccountCheck e) {
			//e.printStackTrace();
		}
	}
}
