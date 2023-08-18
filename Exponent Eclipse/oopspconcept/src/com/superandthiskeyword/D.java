package com.superandthiskeyword;

public class D extends C {

	D() {
		this(10);
		System.out.println("default D");

	}

	D(int i) {

		super();

		System.out.println(" single parameter of child class");
	}

	public static void main(String[] args) {

		D d = new D(); // child class

	}

}
//super & this keyword constructor