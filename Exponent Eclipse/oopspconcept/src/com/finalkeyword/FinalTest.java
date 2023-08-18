package com.finalkeyword;

public final class FinalTest {// final class keyword not extends 

	final int i = 88; // variable not change value fix value or constant

	final public void m1() {// method not override

		System.out.println("=== m1 method of finaltestclass ===");
	}

	public static void main(String[] args) {

		FinalTest f = new FinalTest();

		System.out.println(f.i );
		f.m1();
	}

}
  // final keyword