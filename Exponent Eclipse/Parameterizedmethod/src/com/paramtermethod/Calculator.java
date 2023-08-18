package com.paramtermethod;

public class Calculator {

	public int addition(int k, int h) {
		System.out.println("you are perfoming addition of " + k + "   " + h);

		int c = k + h;
		return c;
	}

	public double addition1(double d1, int h) {
		Double sum1 = d1 + h;

		System.out.println(d1 + "  " + h);

		return sum1;

	}

	public static void main(String[] args) {
		System.out.println("*****main method started*****");

		Calculator cl = new Calculator();
		int sum = cl.addition(70, 70);
		System.out.println(" Addition method sum :" + sum);

		double sum1 = cl.addition1(74.89, 79);
		System.out.println("double method addition:" + sum1);

	}

}
