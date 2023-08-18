 package com.exponent.usermanagmentsystem.serviceIimpl;

import java.util.Scanner;

import com.exponent.usermanagmentsystem.model.User;
import com.exponent.usermanagmentsystem.servise.UserService;

public class Userserviceimpl implements UserService {
	public static final int MAX_USER = 2;
	User[] userArray = new User[MAX_USER];
	Scanner sc = new Scanner(System.in);

	@Override
	public void adduser() {

		System.out.println(" How Many User u Want to add :-");
		int choice = sc.nextInt();
		for (int i = 0; i < choice; i++) {

			User u = new User();
			System.out.println("Enter user id :");

			int uid = sc.nextInt();
			u.setUid(uid);
			userArray[i] = u;

			System.out.println("Enter user name : ");

			String uname = sc.next();
			u.setUname(uname);
			userArray[i] = u;

			System.out.println("Enter user passward :");
			String upass = sc.next();
			u.setUpass(upass);
			userArray[i] = u;

			System.out.println("Enter user address :");
			String address = sc.next();
			u.setAddress(address);
			userArray[i] = u;

			System.out.println("Enter user mobail no :");
			long umobail = sc.nextLong();
			u.setUmobile(umobail);
			userArray[i] = u;
		}

	}

	@Override
	public void deleteuser() {

		System.out.println("Enter user delete id :-");

		int uid = sc.nextInt();
		int index = 0;

		boolean flag = true;
		for (User u1 : userArray) {
			if (u1.getUid() == uid) {
				flag = true;
				break;

			}
			index++;

		}
		System.out.println("Index to delete User: " + index);
		userArray[index] = null;
	}

	@Override
	public User[] getAllUserDetails() {

		for (User u2 : userArray) {

			if (u2 != null) {

				System.out.println("user id :-" + u2.getUid());
				System.out.println("User name :-" + u2.getUname());
				System.out.println("User passward :-" + u2.getUpass());
				System.out.println("User Address :-" + u2.getAddress());
				System.out.println("User mobail no :-" + u2.getUmobile());

				System.out.println("<<<<<<<<<< ALL USE DETAILS >>>>>>>>>>>>");
			}
		}
		return userArray;
	}

}
//
//array project user management system 
