package com.interfaceExample;

public class Demo implements I10 {

	public static void main(String[] args) {
		
		System.out.println(I10.x);
		System.out.println(Demo.x);
		System.out.println(x);
		
		I10  i= new  Demo();
		System.out.println(i.x);
		
		Demo d = new Demo();
		System.out.println(Demo.x);
	}

}
