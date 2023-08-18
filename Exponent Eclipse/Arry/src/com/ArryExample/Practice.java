package com.ArryExample;

public class Practice {

	public static void main(String[] args) {
		// Array = Collection of elements same data type
		// = Homogenize data type
		System.out.println("-------- Integer array ----------");

		int[] a = new int[5];
//index : length 
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		System.out.println(a.clone());// object copy
		System.out.println(a.equals(a));// object compearisaem
		// object present true
		System.out.println(a.equals(3));// object not present false
		System.out.println(a.hashCode());// hash code print return type int
		System.out.println(a.toString());// hash code print return type String
		System.out.println(a.length);// length size print
		System.out.println(a[2]);// index print length

		System.out.println("----- doubal array ---------");
		double[] arryofdoubal = { 1.1, 2.1, 2.2, 3.2, 4.3 };
		System.out.println(arryofdoubal.length);
		System.out.println(arryofdoubal[4]);// index get we have print value
		System.out.println("---for loop ---");
		for (int i = 0; i < arryofdoubal.length; i++) {
			System.out.println(arryofdoubal[i]);
		}

		System.out.println("---- for each loop----");

		for (double d : arryofdoubal) {

			System.out.println(d);
		}

		System.out.println("----------- String array --------");

		String[] arrayofstdent = { "mauli", "Suraj", "rushi" };

		System.out.println(arrayofstdent.length);
		System.out.println(arrayofstdent[2]); 

		System.out.println("-----for loop----");
		for (int i = 0; i < arrayofstdent.length; i++) {
			System.out.println(arrayofstdent[i]);
		}
		
		System.out.println("------------for each loop----------");
		for (String l : arrayofstdent) {
			System.out.println(l);

		}

	}

}
