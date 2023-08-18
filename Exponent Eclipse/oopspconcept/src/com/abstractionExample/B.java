package com.abstractionExample;

public class B extends Demo {

	@Override
	public void m1() {  // abstract method override

		System.out.println(" implimention method in child class");
	}

	public static void main(String[] args) {

		// Demo demo = new Demo(); // abstract class not object

		Demo D = new B(); // parent child mixed object
        D.m1();
        
        B b = new B (); // child class object
        b.m1();
        
	}
}
//abstraction of abstract classS