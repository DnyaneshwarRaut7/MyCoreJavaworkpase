package com.accessmodifiers2;

import accessmodifiers.Defaulttest;
import accessmodifiers.ProtectedTest;

public class Test extends ProtectedTest {
    
	int rno = 88;
	
	public static void main(String[] args) {

		//Defaulttest d = new Defaulttest();
		
		//System.out.println(d.i);
		//d.m1();
      
		ProtectedTest p = new ProtectedTest(); 
		
		Test t = new Test();
		System.out.println(t.id);
		System.out.println(t.rno);
		t.m1();
	}

}
//protected access modifiers within class / same package /  out site package   
//parent child relation ship class objects