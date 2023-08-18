package com.condition;

public class ifElseifElseMain {

	public static void main(String[] args) {

		System.out.println("=== main method started===");

		boolean flag = true;

		if (flag) {

			System.out.println("insite if condition");
		}

		else {

			System.out.println("insite else condition");
		}

		int i = 10;
		System.out.println(i > 15);
		if (i > 15) {

			System.out.println("i is greater than 15");
		} else {
			System.out.println("i is less than 15");
		}
		int percentage = 60;
		System.out.println(percentage < 65);
		if (percentage < 65) {
			System.out.println("persentage is greater than 65");
		} else {
			System.out.println("persentage is less than 65 ");

			// System.out.println("you are in distinction");
		}

		System.out.println("=== main method complited ===");
	}
}
// if else condition