package com.Stringexample;

public class StringClassMethod {

	public static void main(String[] args) {

		String s = ("  Hi I am mauli ");
		
		System.out.println(s);

		s = s.trim(); // starting & ending space remove
		System.out.println(s);

		s = s.toUpperCase(); // Capital words letter
		System.out.println(s);

		s = s.toLowerCase(); // small words letter
		System.out.println(s);

		char[] charofarray = s.toCharArray();// char letter

		for (char c : charofarray)  //for each loop use 

		{

			System.out.println(c);

		}
		System.out.println("------charAt method --------");// char at method 
		String charat= "javapoint"; 
		
		char c = charat.charAt(5);// number print kela tar tay numbercha char print hoto
		
		System.out.println(c);

	}
}
// String method