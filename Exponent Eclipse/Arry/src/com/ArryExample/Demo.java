package com.ArryExample;

public class Demo {

	public static void main(String[] args) {

		String[] arryofstring = { "mauli", "tushar", "sumit", "suraj", "banti" };

		System.out.println(arryofstring.length);

		System.out.println("===== normal for loop =====");

		for (int i = 0; i < arryofstring.length; i++) { // for loop
			System.out.println(arryofstring[i]);
		}

		System.out.println(" ========  for each loop ===== ");

		for (String s: arryofstring) { // for each loop

			System.out.println(s);
		}

	}

}
//Arry Instantiating 3 way for loop & for each loop