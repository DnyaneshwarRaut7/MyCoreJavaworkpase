package com.polymorphism;

public class Bank {

	public void createAccount(int i) {

		System.out.println("===== create saving account ======" );

	}

	public void createAccount(int i, int j) {

		System.out.println("====== create current account =====");
	}

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.createAccount(10);
        bank.createAccount(20,30);
		
		//class
		System.out.println("1");
		System.out.println(2);
		System.out.println('a');
		System.out.println(99.999d);
		System.out.println(88.88f);
		System.out.println(true);
		
		System.out.println(7+" "+8);
	} 

}
//polymorphism  method overloading same class or same method different  parameter