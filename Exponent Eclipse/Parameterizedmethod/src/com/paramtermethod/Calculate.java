package com.paramtermethod;

public class Calculate {

	public int add(int i, int j) {
		int c = i + j;

		System.out.println("value ofi" + i);
		System.out.println("value ofj" + j); 
		return c;
	}

	public int sub(int i, int j) {
		int c = i - j;
		return c;
	}

	public int mul(int n, int m) {
		int result = n * m;
		return result;

	}

	public static void main(String[] args) {

		Calculate c = new Calculate();
		
		int addition = c.add(10, 30);
		System.out.println("Addition of two no:" + addition);

		int substractions = c.sub(90, 70);
		System.out.println("Substractions of two no is:" + substractions);

		int multiplication = c.mul(5, 25);
		System.out.println("Multiplication of two no is:"+ multiplication);

	}

}
