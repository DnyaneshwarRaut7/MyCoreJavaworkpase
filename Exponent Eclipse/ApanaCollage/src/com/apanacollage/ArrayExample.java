package com.apanacollage;

public class ArrayExample {

	public static void main(String[] args) {

		int[] a = new int[5];

		a[1] = 4;
		a[4] = 3;
		a[3] = 0;
		
		 
		
		System.out.println(a.length);
		System.out.println(a[4]);
		
		System.out.println("Using for loop");
		
		for( int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("Using for each loop");
		
		for(int s:a) {
			System.out.println(s);
		}
	}

}
