package com.throwthrowsKeyword;

public class ThrowKeyword {

	public static void validatedAge(int age) {

		System.out.println("=== Enrey into the validate age method ===");

		if (age < 18) {// 18 to above age

			throw new ArithmeticException("Persion is not eligible to create to bank account ,please visit after 18 ");

		} else {

			System.out.println("Persion is eligiable to create the bank account.....");
		}
	}

	public static void main(String[] args) {

		try {
			validatedAge(16);// Person is not eligible
			// validatedAge(20);// person is eligible

		} catch (ArithmeticException e) {

			e.printStackTrace();
		}

	}

}
// throw keyword Ex...1 method 2 method madhe call karne
// throw keyword he method chay aat use karu sakto
// throw method use onely 1 exception