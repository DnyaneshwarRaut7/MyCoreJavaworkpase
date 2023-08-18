package com.stringcompare;

public class Logic {

	public static void main(String[] args) {
		
		String s = "Mauli";//litral object constant pool area
		String s1 = new String("mauli");// using new keyword  heap area
		
		String s2 = "mauli";
		String s3 = s;
		
		String s4 = new String("Mauli");
				
		// equal method ---- object class
		// override in string
		// cantain chake
		
		System.out.println(s.equals(s1));// cantain same not capital small // false
		System.out.println(s1.equals(s2));//true
		System.out.println(s3.equals(s4));// true
		
		
		//equal== operator
		// refreance & address
		
		System.out.println("______________equal == methood______");
		
		System.out.println(s==s1);// false
		System.out.println(s==s3);//true
		System.out.println(s1==s4);//false
		
		System.out.println("==== equal ingnor case ===");// world change 
		
		String ii = "mauli";
		String nn = "rajuri";		
		System.out.println(s.equalsIgnoreCase(s1));// true
		System.out.println(s3.equalsIgnoreCase(s4));// true
		System.out.println(ii.equalsIgnoreCase(nn));// false
		
		
	}

}
// string compair