package com.polymorphism;

public class Bank3 {

	public String createAccount(int i) {

		System.out.println("===== create saving account ======");
		return "saving Account";

	}

	public void createAccount(int i, int j) {

		System.out.println("====== create current account =====");
	}

	
	public static void main(String[] args) {

		Bank3 bank3 = new Bank3();
		bank3.createAccount(77);
		bank3.createAccount(88, 99);

	}

}
//polymorphism  method overloading same class return type doesnt matter
