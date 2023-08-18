package com.polymorphism;

public class Bank1 {

	private void createAccount(int i) {

		System.out.println("===== create saving account ======");

	}

	protected void createAccount(int i, int j) {

		System.out.println("====== create current account =====");
	}

	public static void main(String[] args) {

		Bank1 bank1 = new Bank1();
		// bank1.createAccount(77);
		bank1.createAccount(88, 99);

		// class
		System.out.println("1");
		System.out.println(2 + " " + 5);
		System.out.println('a');
		System.out.println(99.999d + " " + 77.66d);
		System.out.println(88.88f + " " + 66.66f);
		System.out.println(true + " " + false);

	}

}
//polymorphism  method overloading same class access modifiers doesnt matter