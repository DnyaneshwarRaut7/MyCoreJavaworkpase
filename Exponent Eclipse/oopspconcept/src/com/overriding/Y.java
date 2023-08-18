package com.overriding;

public class Y {

	Z z = new Z();// global variable

	Y() {

		System.out.println("==== y class default con=====");
	}

	public static void main(String[] args) {

		Y y = new Y();
	}

}
