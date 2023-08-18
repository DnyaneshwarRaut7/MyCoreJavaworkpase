package com.abstractionExample;

public class BMW extends vehicle {

	@Override
	public void specification() {

		System.out.println("=== BMW specification ");
	}

	public static void main(String[] args) {

		System.out.println("----- parent child mix class----");

		vehicle v2 = new BMW(); // parent + child mix object

		v2.tyre();
		v2.Tering();
		v2.specification();

		System.out.println(" ------ child class-----  ");

		BMW bmw = new BMW(); // child class
		bmw.tyre();
		bmw.Tering();
		bmw.specification();

	}

}
//abstraction of abstract class in abstract override method