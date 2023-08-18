package com.custamexception;

import java.io.IOException;

public class B extends A {
	
	
	B() throws IOException// same Exception  & parent class exception 
	{
		
		
		
	}
	
	@Override
	public void m1() throws IOException {// same Exception & child class exception
		
		System.out.println(" child class overide m1 method");
	}

}
