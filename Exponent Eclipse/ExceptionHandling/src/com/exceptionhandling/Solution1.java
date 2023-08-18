package com.exceptionhandling;

public class Solution1 {

	public static void main(String[] args) {
		
		System.out.println("exception hande will be executed");
		
		try {
			Integer i = new Integer("mauli");
			System.out.println("valu of i"+ i);
			
		} catch (Exception e) {
			System.err.println("catch block");
			e.printStackTrace();
		}
		System.out.println("not execuated");
	}

}

//exceptional handel example String example