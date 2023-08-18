package com.inheritanceexample;

public class R extends Q {

	// P+Q+R

	int k = 30;

	public void m3() {
		System.out.println("R class m3 method");

	}

	public static void main(String[] args) {

		P p = new P();
		System.out.println(p.i);
		p.m1();
		
		System.out.println("=======================");

		System.out.println("Q class object");
		Q q = new Q();
		System.out.println(q.i);
		System.out.println(q.j);
		q.m1();
		q.m2();
		
		System.out.println("===============================");

		System.out.println("R class object");
		R r = new R();
		System.out.println(r.i);
		System.out.println(r.j);
		System.out.println(r.k);
		r.m1();
		r.m2();
		r.m3();
	}

}
//Multilevel inheritance