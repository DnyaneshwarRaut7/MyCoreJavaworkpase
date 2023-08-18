package com.multipalinterface;

public class Test implements X, Y {

	@Override
	public void m2() {

		System.out.println("=====:: m2 method of Y interface");

	}

	@Override
	public void m1() {

		System.out.println("=====:: m1 method of X interface");

	}

	public static void main(String[] args) {

		X x = new Test();// indirect object X
		x.m1();

		Y y = new Test(); // indirect object y
		y.m2();

		Test t = new Test();// child object
		t.m1();
		t.m2();

	}

}

//Multiple interface example