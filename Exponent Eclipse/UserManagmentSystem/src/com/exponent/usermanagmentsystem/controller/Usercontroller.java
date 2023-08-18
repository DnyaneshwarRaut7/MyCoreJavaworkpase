package com.exponent.usermanagmentsystem.controller;

import java.util.Scanner;

import com.exponent.usermanagmentsystem.serviceIimpl.Userserviceimpl;
import com.exponent.usermanagmentsystem.servise.UserService;

public class Usercontroller {

	public static void main(String[] args) {

		System.out.println("******** WELCOME TO USER MANAGENENT SYSTEM********");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		UserService us = new Userserviceimpl();

		while (flag) {

			System.out.println("================================");

	 		System.out.println("1 :- ADD USER INFORMENRION ");
			System.out.println("2 :- DELETE USER INFORMENTION");
			System.out.println("3 :- GET ALL USER DETAILS ");
			System.out.println("4 :- EXIT ");
			System.out.println("==============================");

			System.out.println("Enter your choice :- ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				us.adduser();
				break;

			case 2:
				us.deleteuser();
				break;

			case 3:
				us.getAllUserDetails();
				break;
			case 4:
				flag = false;
			default:
				System.out.println("Wrong choice");
			}

		}
		sc.close();

	}

}

//array project user management system
