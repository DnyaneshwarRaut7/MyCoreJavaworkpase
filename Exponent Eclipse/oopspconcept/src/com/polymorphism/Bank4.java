package com.polymorphism;

public class Bank4 {

	public void createAccount(int i) {

		System.out.println("===== create saving account ======");
	}

	public void createAccount(int i, int j) {

		System.out.println("====== create current account =====");
	}

	static void m5(int k) {

	}

	static void m5(int k, int s) {

		System.out.println("=== static method overloading===");
}

	final void m6(int f) {

	}

	final void m6(int k, int s) {

		System.out.println(" === final method overloading ===  ");

	}

	private void m7(int p) {
	}

	private void m7(int p, int q) {

		System.out.println("=== private method overloading ====");
	}

	static void main(Integer[] args) {

		System.out.println("=== main method overloading===");
	}

	public static void main(String[] args) {

		Bank4 bank4 = new Bank4();
		bank4.createAccount(88);
		bank4.createAccount(99, 80);
		bank4.m7(88,88);

	}

}
//polymorphism  method overloading same class main,static,final & private methods