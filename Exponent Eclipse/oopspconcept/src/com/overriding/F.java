package com.overriding;

public class F extends E {

	@Override
	protected void m2() {

		System.out.println(" m2 method overide child class");
	}

	@Override
	public void m3() {

		System.out.println("====overide m3 method");
	}

	@Override
	public void m4() {

		System.out.println("==overide m4 method===");
	}

	public static void main(String[] args) {

		E e = new E();
		e.m2();
		e.m3();
		e.m4();

		E e1 = new F();
		e1.m2();
		e1.m3();
		e1.m4();
	}

}

//pollymorphism in overriding same method & access modifier same or greater than 