package com.superandthiskeyword;

public class P {

	P(int i) {

		this("XYZ", false);
		System.out.println("111");
	}

	public P(String string, boolean b) {

		this();
		System.out.println("222");
	}

	P() {
		System.out.println("333");
	}
}

//super & this keyword constructor  chain