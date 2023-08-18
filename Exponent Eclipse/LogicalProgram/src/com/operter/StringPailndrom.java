package com.operter;

import java.util.Scanner;

public class StringPailndrom {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the String : ");
	
	String str = sc.next();
	
	String rev = "  ";
	
	for(int j= str.length()-1;j>=0;j--) {
		
		rev = rev + str.charAt(j);
		
	}
	 System.out.println("Reverse String is"+rev);
	 
	 if (str.equals(rev)) {
		 
		 
		 System.out.println(str+" pailndrom number");
	 }
	 else
	 {
		 
		 System.out.println(str+"is not pailndrom");
	 }
	
	}

}
