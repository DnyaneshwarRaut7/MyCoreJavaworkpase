package com.Stringexample;

public class Demo {

	public static void main(String[] args) {

		// 2 types of String object

		// 1st way = String literal

		System.out.println("===== string litral ======");

		String s = "java";

		System.out.println(s);// java
       s= s.concat(s);// java java
		s = s.concat ("languange");// java java languange
		System.out.println(s);
		
		System.out.println("==============================");

		String s1 = "Programming";
		System.out.println(s1);// programming 
         
		s1 = s1.concat("Class");// programming class
		System.out.println(s1);
        System.out.println(s);// java java languange
		
		// 2nd way = using new
        
        System.out.println("===== using new using =======");
        
        String ss = new String("mauli");
        
        String ss1 = new String (s);
        
        ss1=ss.concat(ss1);
        
        System.out.println(ss1);
        }
	}
// string object litral & using new keyward